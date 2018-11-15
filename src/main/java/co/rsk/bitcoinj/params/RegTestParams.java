/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.rsk.bitcoinj.params;

import co.rsk.bitcoinj.core.Sha256Hash;
import co.rsk.bitcoinj.core.Utils;

import static com.google.common.base.Preconditions.checkState;

/**
 * Network parameters for the regression test mode of bitcoind in which all blocks are trivially solvable.
 */
public class RegTestParams extends AbstractBitcoinNetParams {

    public RegTestParams() {
        super();
        // Difficulty adjustments are disabled for regtest. 
        // By setting the block interval for difficulty adjustments to Integer.MAX_VALUE we make sure difficulty never changes.    

        id = ID_REGTEST;
        packetMagic = Pai.RegTest.packetMagic;
        interval = Integer.MAX_VALUE;
        targetTimespan = TARGET_TIMESPAN;
        maxTarget = Utils.decodeCompactBits(Pai.RegTest.GENESIS_BLOCK_NBITS);
        port = Pai.RegTest.port;
        addressHeader = Pai.RegTest.addressHeader;
        p2shHeader = Pai.RegTest.p2shHeader;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        dumpedPrivateKeyHeader = Pai.RegTest.dumpedPrivateKeyHeader;
        genesisBlock.setTime(Pai.RegTest.GENESIS_BLOCK_UNIX_TIMESTAMP);
        genesisBlock.setDifficultyTarget(Pai.RegTest.GENESIS_BLOCK_NBITS);
        genesisBlock.setNonce(Pai.RegTest.GENESIS_BLOCK_NONCE);
        spendableCoinbaseDepth = 100;
        subsidyDecreaseBlockCount = 150;

        String genesisHash = genesisBlock.getHashAsString();
        checkState(genesisHash.equals(Pai.RegTest.CONSENSUS_HASH_GENESIS_BLOCK));

        dnsSeeds = null;
        addrSeeds = null;
        bip32HeaderPub = Pai.RegTest.bip32HeaderPub;
        bip32HeaderPriv = Pai.RegTest.bip32HeaderPriv;

        majorityEnforceBlockUpgrade = MainNetParams.MAINNET_MAJORITY_ENFORCE_BLOCK_UPGRADE;
        majorityRejectBlockOutdated = MainNetParams.MAINNET_MAJORITY_REJECT_BLOCK_OUTDATED;
        majorityWindow = MainNetParams.MAINNET_MAJORITY_WINDOW;
        checkpoints.put(0, Sha256Hash.wrap(Pai.RegTest.CONSENSUS_HASH_GENESIS_BLOCK));
    }

    @Override
    public boolean allowEmptyPeerChain() {
        return true;
    }

    private static RegTestParams instance;
    public static synchronized RegTestParams get() {
        if (instance == null) {
            instance = new RegTestParams();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_REGTEST;
    }

    @Override
    protected String getGenesisScriptSignature() {
        return Pai.RegTest.GENESIS_BLOCK_SIGNATURE;
    }

}
