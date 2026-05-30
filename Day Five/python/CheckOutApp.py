def main():
    subtotal = 0.0

    print("Welcome to Semicolon Store")

    while True:
        name = input("\nEnter product name: ")

        price = float(input("Enter price: "))

        quantity = int(input("Enter quantity: "))

        total = price * quantity
        subtotal += total

        # Print item immediately
        print(f"Added: {name} | Total: {total:.2f}")

        choice = input("Add another item? (yes/no): ")

        if choice.lower() == "no":
            break

    # Discount
    discount = float(input("\nEnter discount amount: "))

    # VAT
    vat = 0.075 * subtotal

    finalTotal = subtotal + vat - discount

    # Final Summary
    print("\n========== SUMMARY ==========")
    print(f"Subtotal: {subtotal:.2f}")
    print(f"Discount: {discount:.2f}")
    print(f"VAT (7.5%): {vat:.2f}")
    print(f"Total to pay: {finalTotal:.2f}")
    print("=============================")

if __name__ == "__main__":
    main()
