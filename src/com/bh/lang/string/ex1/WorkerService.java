package com.bh.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {

	//private String info;
	private StringBuffer sb;
	
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa -영업 부장-013333");
		sb.append(", hani-마케팅-사원-0104444");
	}
	
	public WorkerDTO [] init() {
		//info 파싱해서 worerDTO에 대입하고
		//WorkerDTO를 모은 배열을 리턴
		String info = sb.toString();
		String newInfo = info.replace(",", "-");
		StringTokenizer st = new StringTokenizer(newInfo, "-");
		
		WorkerDTO [] workerDTOs = new WorkerDTO[st.countTokens()/4];
		int index=0;
		
		while(st.hasMoreTokens()) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTO.setName(st.nextToken());
			workerDTO.setDepartment(st.nextToken());
			workerDTO.setJob(st.nextToken());
			workerDTO.setPhone(st.nextToken());
			workerDTOs[index] = workerDTO;
			index++;
		}
		
//		String [] infos = newInfo.split("-");
//		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
//		
//		System.out.println(infos.length);
//		
//		//i 0, 1, 2, 3
//		for(int i=0; i<infos.length; i++) {
//			WorkerDTO workerDTO = new WorkerDTO();
//			workerDTOs[i/4] = workerDTO;
//			workerDTO.setName(infos[i].trim());
//			workerDTO.setDepartment(infos[++i].trim());
//			workerDTO.setJob(infos[++i].trim());
//			workerDTO.setPhone(infos[++i].trim());
//		}
		
		return workerDTOs;
		
	}
	
}
