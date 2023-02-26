---
title: Features
weight: 12
---

# Features
## Adding a task

Duke supports 3 different types of tasks:
1. Todo - A generic task with a description.
2. Deadline - Allows the user to set when the task needs to be completed.
3. Event - Allows the user to specify the start and end date and time of the task.

To add a task, you need to follow the format of the required task:

| Task     | Command    | Format                                                  |
| -------- | ---------- | ------------------------------------------------------- |
| Todo     | `todo`     | `todo <description>`                                    |
| Deadline | `deadline` | `deadline <description> /by <date>`                     |
| Event    | `event`    | `event <description> /from <start date> /to <end date>` |

> Note: When entering deadlines and events ensure that there is a space character before and after the modifiers denoted with `/` 
> - ✅: `deadline submit assignment /by 2023-01-01 1111`
> - ❌: `deadline plant mango tree/by 2023-12-31 1234`
> - ❌: `event mango party /from 2023-01-01 0000/to 2023-12-31 2359`

### Format for entering dates
- You should use the following format when entering dates: `yyyy-MM-dd HHmm`.
- For single digit numbers, you may choose to omit the leading zero.

| Parameter | Meaning                       | Example |
| --------- | ----------------------------- | ------- |
| `yyyy`    | year-of-era                   | 2023    |
| `MM`      | month-of-year (1 or 2 digits) | 03, 12  |
| `dd`      | day-of-month (1 or 2 digits)  | 17, 31  |
| `HH`      | hour-of-day (0-23)            | 01, 22  |
| `mm`      | minute-of-hour                | 5, 30   |

__Example:__
- `todo buy mangoes`
  - Creates a new todo: `buy mangoes`
- `deadline cut mangoes /by 2022-12-31 2359`
  - Creates a new deadline: `cut mangoes`
  - By: `Dec 31, 2022 2359H`
- `event mango party /from 2023-01-01 0000 /to 2023-12-31 2359`
  - Creates a new event: `mango party` 
  - From: `Jan 1, 2023 0000H`
  - To: `Dec 31, 2023 2359H` 


## Viewing tasks available `list`

Lists all the tasks stored in the application.

Format: `list`


## Mark as complete `mark`

Sets the status of the task as complete.    

Format: `mark <id>`
- Updates the task corresponding to the given `id`.
- `id` should be a positive integer less than the number of tasks in the list.

Example: `mark 3` - Sets the third task in list as complete.


## Mark as incomplete `unmark`

Sets the status of the task as incomplete.    

Format: `unmark <id>`
- Updates the task corresponding to the given `id`.
- `id` should be a positive integer less than the number of tasks in the list.

Example: `unmark 5` - Sets the fifth task in list as incomplete.


## Searching for tasks `find`

Search for specific keywords for tasks in the list. 
Search is case insensitive and supports regular expressions.

Format: `find <keyword/regex>`
- Matches all words given, including any spaces
- Returns a list of tasks with text matching the given keywords or regular expression

Example:
- `find (apple juice)|mango` - Searches for descriptions matching `apple juice` or `mango`
- `find 2023-01` - Searches for all tasks in January 2023

## Deleting a task `delete`

Format: `delete <id>`

Example: `delete 1` - Deletes the first task in the list.

## Exiting the program `bye`

Format: `bye`

Exits the application. 


## Saving the data

The application data is saved automatically after every operation performed. 
There is no need for the user to manually save the data.