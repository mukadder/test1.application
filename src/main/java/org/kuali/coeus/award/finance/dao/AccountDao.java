package org.kuali.coeus.award.finance.dao;

import org.kuali.coeus.award.finance.AwardAccount;
import org.kuali.coeus.sys.framework.summary.SearchResults;
import org.kuali.kra.award.home.Award;

import java.util.Collection;
import java.util.List;

public interface AccountDao {

    public List<AwardAccount> getAccounts(Integer startIndex, Integer size);

    public AwardAccount getAccount(String accountNumber);

    public AwardAccount saveAccount(AwardAccount account);

    public Award getAward(String awardId);

    public List<Award> getLinkedAwards(String accountNumber);

    }
