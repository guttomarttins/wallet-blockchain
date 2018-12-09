package blockchain02.model;

/**
 *
 * @author Carlos
 */
public class TransactionInput {

    public String transactionOutputId; //Reference to TransactionOutputs -> transactionId
    public TransactionOutput UTXO; //Contains the Unspent transaction output

    public TransactionInput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}
