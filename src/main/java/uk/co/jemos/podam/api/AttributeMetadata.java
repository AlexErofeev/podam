/**
 * 
 */
package uk.co.jemos.podam.api;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;

import net.jcip.annotations.Immutable;

/**
 * Contains metadata about the attribute for which a value is being assigned.
 * <p>
 * This class is available to all strategies and it allows users to customise
 * behaviour of a strategy depending on the metadata of the attribute to which a
 * value is being assigned. For instance, clients might assign different values
 * based on the attribute name.
 * </p>
 * 
 * @author mtedone
 * 
 */
@Immutable
public class AttributeMetadata implements Serializable {

	// ------------------->> Constants

	private static final long serialVersionUID = 1L;

	// ------------------->> Instance / Static variables

	/** The attribute name */
	private final String attributeName;

	/** The attribute type */
	private final Class<?> attributeType;

	/** The attribute annotations */
	private final List<Annotation> attributeAnnotations;

	// ------------------->> Constructors

	/**
	 * Full constructor.
	 * 
	 * @param attributeName
	 *            The attribute name
	 * @param attributeType
	 *            The attribute type
	 * @param attributeAnnotations
	 *            The attribute annotations
	 */
	public AttributeMetadata(String attributeName, Class<?> attributeType,
			List<Annotation> attributeAnnotations) {
		super();
		this.attributeName = attributeName;
		this.attributeType = attributeType;
		this.attributeAnnotations = attributeAnnotations;
	}

	// ------------------->> Public methods

	// ------------------->> Getters / Setters

	public String getAttributeName() {
		return attributeName;
	}

	public Class<?> getAttributeType() {
		return attributeType;
	}

	public List<Annotation> getAttributeAnnotations() {
		return attributeAnnotations;
	}

	// ------------------->> Private methods

	// ------------------->> equals() / hashcode() / toString()

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AttributeMetadata [attributeName=");
		builder.append(attributeName);
		builder.append(", attributeType=");
		builder.append(attributeType);
		builder.append(", attributeAnnotations=");
		builder.append(attributeAnnotations);
		builder.append("]");
		return builder.toString();
	}

	// ------------------->> Inner classes

}
