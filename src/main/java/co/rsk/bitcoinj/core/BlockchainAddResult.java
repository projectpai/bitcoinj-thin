/**
 * 
 */
package co.rsk.bitcoinj.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mario
 *
 */
public class BlockchainAddResult {

	private boolean success = false;
	private boolean exists = false;

	private List<BtcBlock> orphansBlocksConnected = new ArrayList<BtcBlock>();
	private List<FilteredBlock> orphansFilteredBlocksConnected = new ArrayList<FilteredBlock>();



	public void addConnectedOrphan(BtcBlock block) {
		orphansBlocksConnected.add(block);
	}

	public void addConnectedOrphans(List<BtcBlock> blocks) {
		orphansBlocksConnected.addAll(blocks);
	}

	public void addConnectedFilteredOrphan(FilteredBlock block) {
		orphansFilteredBlocksConnected.add(block);
	}

	public void addFilteredOrphans(List<FilteredBlock> blocks) {
		orphansFilteredBlocksConnected.addAll(blocks);
	}

	public List<BtcBlock> getOrphansBlockConnected() {
		return orphansBlocksConnected;
	}
	
	public List<FilteredBlock> getFilteredOrphansConnected() {
		return orphansFilteredBlocksConnected;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean success() {
		return success;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}

	public boolean exists() {
		return exists;
	}
}
