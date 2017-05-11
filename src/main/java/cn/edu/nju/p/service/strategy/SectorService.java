package cn.edu.nju.p.service.strategy;

import java.util.List;

/**
 * 板块相关的service
 */
public interface SectorService {

    List<String> getStocks(String sector);

    List<String> getAllStocks();
}