package structural.proxy.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote {
    public String generateDailyReport() throws RemoteException;
}
