## Circular buffer

### 1. Data structure ? (Internal)
```Ans``` Array of String

### 2. Operations/Behavior/Methods ? user -> CB ?
- writeData(string):void

- readData(): string

- isFull(): boolean

- isEmpty(): boolean

- setSize(int): void

### 3. Internal process ?
- buffer size = 10 (default)
- read pointer = 0
- write pointer = 0

### 4. Test Cases
- TC001 - create_new_buffer_should_empty
- TC002 - create_new_buffer_with_default_size_should_10
- TC003 - write_A_B_to_buffer_should_read_A_B_from_buffer
- TC004 - create_new_buffer_with_set_size_20_and_write_10string_should_not_fulls
- TC005 - write_AZ1_to_AZ10_then_read_AZ1_to_AZ10_then_write_AZ11_should_read_AZ11
