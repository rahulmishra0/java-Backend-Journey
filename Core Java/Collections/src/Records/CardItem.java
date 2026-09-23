package Records;
//Records ka use immutability ke liye karte h taki baad m data baar baar change na ho

public record CardItem(
        long productId,
        String productName,
        int quantity,
        double price
) {
}
