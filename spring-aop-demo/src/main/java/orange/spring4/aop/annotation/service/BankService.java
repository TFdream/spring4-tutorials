package orange.spring4.aop.annotation.service;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-04-03 11:11
 */
public interface BankService {

    boolean transfer(String from, String to, int amount);
}
