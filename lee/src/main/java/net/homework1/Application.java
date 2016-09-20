package net.homework1;

import java.util.List;

import net.homework1.dao.ArtclDaoImpl;
import net.homework1.vo.ArtclVO;

public class Application {
	public static void main(String[] args) {
		ArtclDaoImpl dao = new ArtclDaoImpl();
		List<ArtclVO> artcls = dao.getArtcls();
		for(ArtclVO artclVO: artcls){
			System.out.println(artclVO.getArticleId());
		}
	}
}
