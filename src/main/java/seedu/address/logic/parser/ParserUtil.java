package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.StringUtil;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.note.Content;
import seedu.address.model.note.Title;
import seedu.address.model.question.Answer;
import seedu.address.model.question.Difficulty;
import seedu.address.model.question.QuestionBody;
import seedu.address.model.question.Subject;

/**
 * Contains utility methods used for parsing strings in the various *Parser classes.
 */
public class ParserUtil {
    public static final String MESSAGE_INVALID_INDEX = "Index is not a non-zero unsigned integer.";

    /**
     * Parses {@code oneBasedIndex} into an {@code Index} and returns it. Leading and trailing whitespaces will be
     * trimmed.
     * @throws ParseException if the specified index is invalid (not non-zero unsigned integer).
     */
    public static Index parseIndex(String oneBasedIndex) throws ParseException {
        String trimmedIndex = oneBasedIndex.trim();
        if (!StringUtil.isNonZeroUnsignedInteger(trimmedIndex)) {
            throw new ParseException(MESSAGE_INVALID_INDEX);
        }
        return Index.fromOneBased(Integer.parseInt(trimmedIndex));
    }

    /**
     * Parses a {@code String title} into a {@code Title}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code title} is invalid.
     */
    public static Title parseTitle(String title) throws ParseException {
        requireNonNull(title);
        String trimmedName = title.trim();
        if (!Title.isValidTitle(trimmedName)) {
            throw new ParseException(Title.MESSAGE_CONSTRAINTS);
        }
        return new Title(trimmedName);
    }

    /**
     * Parses a {@code String content} into an {@code Content}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code content} is invalid.
     */
    public static Content parseContent(String content) throws ParseException {
        requireNonNull(content);
        String trimmedAddress = content.trim();
        if (!Content.isValidContent(trimmedAddress)) {
            throw new ParseException(Content.MESSAGE_CONSTRAINTS);
        }
        return new Content(trimmedAddress);
    }

    /**
     * Parses a {@code String number} into an {@code Integer}.
     * Leading and trailing whitespaces will be trimmed.
     */
    public static int parseNumber(String number) throws ParseException {
        requireNonNull(number);
        return Integer.parseInt(number);
    }

    /**
     * Parses a {@code String questionBody} into a {@code QuestionBody}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code questionBody} is invalid.
     */
    public static QuestionBody parseQuestionBody(String questionbody) throws ParseException {
        requireNonNull(questionbody);
        String trimmedBody = questionbody.trim();
        if (!QuestionBody.isValidQuestionBody(trimmedBody)) {
            throw new ParseException(QuestionBody.MESSAGE_CONSTRAINTS);
        }
        return new QuestionBody(trimmedBody);
    }

    /**
     * Parses a {@code String questionBody} into a {@code QuestionBody}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code questionBody} is invalid.
     */
    public static Answer parseAnswer(String answer) throws ParseException {
        requireNonNull(answer);
        String trimmedAnswer = answer.trim();
        if (!Answer.isValidAnswer(trimmedAnswer)) {
            throw new ParseException(Answer.MESSAGE_CONSTRAINTS);
        }
        return new Answer(answer);
    }

    /**
     * Parses a {@code String subject} into an {@code Subject}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code subject} is invalid.
     */
    public static Subject parseSubject(String subject) throws ParseException {
        requireNonNull(subject);
        String trimmedSubject = subject.trim();
        if (!Subject.isValidSubject(trimmedSubject)) {
            throw new ParseException(Subject.MESSAGE_CONSTRAINT);
        }
        return new Subject(trimmedSubject);
    }

    /**
     * Parses a {@code String difficulty} into an {@code Difficulty}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code difficulty} is invalid.
     */
    public static Difficulty parseDifficulty(String difficulty) throws ParseException {
        requireNonNull(difficulty);
        String trimmedDifficulty = difficulty.trim();
        if (!Difficulty.isValidDifficulty(trimmedDifficulty)) {
            throw new ParseException(Difficulty.MESSAGE_CONSTRAINT);
        }
        return new Difficulty((trimmedDifficulty));
    }
}
