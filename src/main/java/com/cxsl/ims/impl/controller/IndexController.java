package com.cxsl.ims.impl.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cxsl.ims.impl.entity.OaHolidayapplyExample;
import com.cxsl.ims.impl.dao.FInvoiceBillMapper;
import com.cxsl.ims.impl.dao.OaHolidayapplyMapper;
import com.cxsl.ims.impl.dto.BodyData;
import com.cxsl.ims.impl.entity.FInvoiceBill;
import com.cxsl.ims.impl.entity.FInvoiceBillExample;
import com.cxsl.ims.impl.entity.OaHolidayapply;

@Controller
public class IndexController {
    @Autowired
    private FInvoiceBillMapper invoiceBillMapper;
    @Autowired
    private OaHolidayapplyMapper oaHolidayapplyMapper;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody BodyData queryInvoiceBills(final @RequestParam(name = "query", required = false) String query) {
        final BodyData response = new BodyData();
        FInvoiceBillExample fex = new FInvoiceBillExample();
        fex.createCriteria().andCreateTimeBetween(DateUtils.addDays(new Date(), -50), new Date());
        List<FInvoiceBill> bills = invoiceBillMapper.selectByExample(fex);
        response.setContent(bills);
        return response;
    }

    @RequestMapping(value = "/holiday-list", method = RequestMethod.GET)
    public @ResponseBody BodyData queryHolidayList(final @RequestParam(name = "query", required = false) String query) {
        final BodyData response = new BodyData();
        OaHolidayapplyExample fex = new OaHolidayapplyExample();
        fex.createCriteria().andApplytimeBetween(DateUtils.addYears(new Date(), -5), new Date());
        List<OaHolidayapply> holidays = oaHolidayapplyMapper.selectByExample(fex);
        response.setContent(holidays);
        return response;
    }
}