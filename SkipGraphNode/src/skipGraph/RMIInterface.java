package skipGraph;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import blockchain.Block;
import blockchain.Transaction;
import remoteTest.Configuration;
import remoteTest.PingLog;

public interface RMIInterface extends Remote {
	
	/*
	 * Normal Skip Node functions
	 */
	
	public NodeInfo getLeftNode(int level,int num) throws RemoteException ;
	public NodeInfo getRightNode(int level,int num) throws RemoteException ;
	public void setLeftNode(int level, NodeInfo newNode,int num) throws RemoteException;
	public void setRightNode(int level,NodeInfo newNode,int num) throws RemoteException;
	public int getNumID() throws RemoteException;
	public String getNameID() throws RemoteException;
	public NodeInfo searchByNameID(String targetString) throws RemoteException;
	public NodeInfo searchByNumID(int targetNum) throws RemoteException;
	public ArrayList<NodeInfo> searchByNameID(String targetString, ArrayList<NodeInfo> lst) throws RemoteException;
	public ArrayList<NodeInfo> searchByNumID(int targetNum,ArrayList<NodeInfo> lst) throws RemoteException;
	public ArrayList<NodeInfo> searchName(String searchTarget,int level,int direction,ArrayList<NodeInfo> lst) throws RemoteException;
	public ArrayList<NodeInfo> searchNum(int searchTarget,int level,ArrayList<NodeInfo> lst) throws RemoteException;
	public int getLeftNumID(int level,int num) throws RemoteException;
	public int getRightNumID(int level,int num) throws RemoteException;
	public String getLeftNameID(int level,int num) throws RemoteException;
	public String getRightNameID(int level,int num) throws RemoteException;
	
	/*
	 * Skip Node with data nodes functions
	 */
	
	public NodeInfo insertSearch(int level, int direction,int num, String target) throws RemoteException;
	
	/*
	 * Skip Node with blockchain support
	 */
	
	
	
	/*
	 * For remote testing
	 */
	public int getDataNum() throws RemoteException;
	public ArrayList<NodeInfo> getData() throws RemoteException;
	public ArrayList<Transaction> getTransactions() throws RemoteException;
	public NodeInfo[][][] getLookupTable() throws RemoteException;
	public void put(Transaction t) throws RemoteException;
	public void put(Block t) throws RemoteException;
	public Configuration getConf() throws RemoteException;
	public boolean ping() throws RemoteException;
	public PingLog pingStart(NodeInfo node, int freq) throws RemoteException;
}
