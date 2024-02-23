package kr.happyjob.study.controller.contents;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.happyjob.study.service.contents.ContentsService;
import kr.happyjob.study.vo.contents.ContentsModel;

@RestController
public class ContentsController {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	   
	
	@Autowired
	private ContentsService contentsService;
	
	// 글 상세조회 
	@RequestMapping("/api/contentsDetail")
	@ResponseBody
	public ContentsModel contentsDetail(@RequestBody ContentsModel params, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	    
	    logger.info("   - params : " + params);

	    ContentsModel contentsDetail = contentsService.contentsDetail(params);
	   
	    return contentsDetail;
	}
	
	
	// 글 등록, 업데이트
	@RequestMapping("/api/contentsSave")
	public Map<String, Object> contentssave(@RequestBody Map<String, Object> paramMap){

				logger.info("+ Start " + className + ".contentssave");
				logger.info("   - paramMap : " + paramMap);
				
				String action = (String)paramMap.get("action");
				String resultMsg = "";

				if ("I".equals(action)) {
					// 그룹코드 신규 저장
					contentsService.insertContents(paramMap);
					resultMsg = "SUCCESS";
				} else if("U".equals(action)) {
					// 그룹코드 수정 저장
					contentsService.updateContents(paramMap);
					resultMsg = "UPDATED";
					System.out.println(paramMap);
				} else {
					resultMsg = "FALSE : 등록에 실패하였습니다.";
				}
				
				//결과 값 전송
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put("resultMsg", resultMsg);
			    
			    return resultMap;
			}
	
	// 글 삭제
		@RequestMapping("/api/contentsDelete")
		public Map<String, Object> contentsDelete(@RequestBody Map<String, Object> paramMap) throws Exception {
			
			logger.info("+ Start " + className + ".noticeDelete");
			logger.info("   - paramMap : " + paramMap);

			String result = "SUCCESS";
			String resultMsg = "삭제 되었습니다.";
			
			// 그룹코드 삭제
			contentsService.deleteContents(paramMap);
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("result", result);
			resultMap.put("resultMsg", resultMsg);
			
			logger.info("+ End " + className + ".noticeDelete");
			
			return resultMap;
		}
}