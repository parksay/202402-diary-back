package kr.happyjob.study.controller.folder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.happyjob.study.service.folder.FolderService;
import kr.happyjob.study.vo.folder.FolderModel;
import kr.happyjob.study.vo.folder.FolderChildModel;
import kr.happyjob.study.vo.login.UsrMnuAtrtModel;


@RestController
public class FolderController {
	
	@Autowired
	private FolderService folderService;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/api/folderView")
	public ResponseEntity folderView(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		List<FolderModel> folderList = folderService.folderView(paramMap);
		
		// 메뉴 목록 조회 1depth
		for(FolderModel list : folderList){
        	Map<String, Object> folderSubList = new HashMap<String, Object>();
        	folderSubList.put("folder_seq", list.getFolder_seq());
        	list.setNodeList(folderService.folderSubView(folderSubList));
		}
		
		resultMap.put("folderList", folderList); // 리턴 값 맵에 담기
		
		return new ResponseEntity(resultMap, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/api/folderCreate")
	public ResponseEntity folderCreate(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println(paramMap);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		folderService.folderCreate(paramMap);
		
		return new ResponseEntity(resultMap, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/api/folderModify")
	public ResponseEntity folderModify(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println(paramMap);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		String stat = (String)paramMap.get("stat");
		if("U".equals(stat)) {
			folderService.folderModify(paramMap);
		} else {
			folderService.folderDelete(paramMap);
		}
		return new ResponseEntity(resultMap, HttpStatus.OK);
	}
}
