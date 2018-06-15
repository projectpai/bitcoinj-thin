package co.rsk.bitcoinj.params;

public class Pai {
    public static final String BITCOIN_SCHEME = "paicoin";
    public static final String BITCOIN_SIGNED_MESSAGE_HEADER = "PAIcoin Signed Message:\n";
    public static final String GENESIS_BLOCK_TIMESTAMP_STRING = "04ffff001d01043c30392f30362f32303137202d2043726561746520796f7572206f776e20617661746172207477696e20746861742074616c6b73206c696b6520796f75"; // "09/06/2017 - Create your own avatar twin that talks like you";
    public static final int GENESIS_BLOCK_REWARD = 1470000000;
    public static final int BLOCK_REWARD = 1500;
    public static final int BLOCK_VERSION_GENESIS = 4;
    public static final int MAX_COINS = 2100000000;


    public static class MainNet {
        public static final int dumpedPrivateKeyHeader = 247;
        public static final int addressHeader = 56; // 0x38
        public static final int p2shHeader = 130; // 0x82
        public static final int port = 8567;
        public static final long packetMagic = 0xfed0d5f2L;
        public static final int bip32HeaderPub = 0x03DD47AF; //The 4 byte header that serializes in base58 to "paip".
        public static final int bip32HeaderPriv = 0x03DD47D9; //The 4 byte header that serializes in base58 to "paiv"

        public static final long GENESIS_BLOCK_NONCE = 460938808L;
        public static final long GENESIS_BLOCK_UNIX_TIMESTAMP = 1504706776L;
        public static final long GENESIS_BLOCK_NBITS = 0x1c09fe61;

        public static final String GENESIS_BLOCK_SIGNATURE = "95ba0161eb524f97d3847653057baaef7d7ba0ff";
        public static final String CONSENSUS_HASH_GENESIS_BLOCK = "00000000018151b673df2356e5e25bfcfecbcd7cf888717f2458530461512343";

        public static String[] dnsSeeds = {
            "34.215.125.66",
            "13.58.110.183",
            "13.124.177.237",
            "193.112.7.193"
        };
    };

    public static class TestNet {
        public static final int dumpedPrivateKeyHeader = 226; //0xe2
        public static final int addressHeader = 51; // 0x33
        public static final int p2shHeader = 180; // 0xb4
        public static final int port = 18567;
        public static final long packetMagic = 0x0b091107L;
        public static final int bip32HeaderPub = 0x03E3C526; // ptpu
        public static final int bip32HeaderPriv = 0x03E3C52D; // ptpv

        public static final long GENESIS_BLOCK_NONCE = 2253953817L;
        public static final long GENESIS_BLOCK_UNIX_TIMESTAMP = 1504706516L;
        public static final long GENESIS_BLOCK_NBITS = 0x1c09fe61;

        public static final String GENESIS_BLOCK_SIGNATURE = "9a8abac6c3d97d37d627e6ebcaf68be72275168b";
        public static final String CONSENSUS_HASH_GENESIS_BLOCK = "0000000003976df1a1393912d10ea68fae1175ee2c7e6011a0dc4e05f18f8403";

        public static String[] dnsSeeds = {
            "52.37.189.65",
            "13.59.205.159",
            "52.78.224.215",
            "193.112.4.118"
        };
    };

    public static class RegTest {
        public static final int dumpedPrivateKeyHeader = TestNet.dumpedPrivateKeyHeader;
        public static final int addressHeader = TestNet.addressHeader;
        public static final int p2shHeader = TestNet.p2shHeader;
        public static final int port = 19567;
        public static final long packetMagic = 0xffd1d6f3L;
        public static final int bip32HeaderPub = TestNet.bip32HeaderPub;
        public static final int bip32HeaderPriv = TestNet.bip32HeaderPriv;

        public static final long GENESIS_BLOCK_NONCE = 0L;
        public static final long GENESIS_BLOCK_UNIX_TIMESTAMP = 1509798928L;
        public static final long GENESIS_BLOCK_NBITS = 0x207fffff;

        public static final String GENESIS_BLOCK_SIGNATURE = "23103f0e2d2abbaad0d79b7a37759b1a382b7821";
        public static final String CONSENSUS_HASH_GENESIS_BLOCK = "47b736c948f15d787327c84bb3ad30a064e67c79154c7608da4b062c1adfe7bb";
    };
}
