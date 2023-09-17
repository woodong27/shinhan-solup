package com.example.solup.dto.expense;

import com.example.solup.dto.TradeHistoryDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CategorizedHistoriesDto {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Integer totalWithdraw;
        private List<TradeHistoryDto.Response> tradeHistories;
    }

}
