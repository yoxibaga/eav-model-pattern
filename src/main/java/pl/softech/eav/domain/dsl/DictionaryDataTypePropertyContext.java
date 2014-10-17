package pl.softech.eav.domain.dsl;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author ssledz
 * @since 1.0 
 */
public class DictionaryDataTypePropertyContext extends DataTypePropertyContext {

	private final String dictionaryIdentifier;

	public DictionaryDataTypePropertyContext(String dictionaryIdentifier) {
		super("dictionary");
		this.dictionaryIdentifier = dictionaryIdentifier;
	}

	public String getDictionaryIdentifier() {
		return dictionaryIdentifier;
	}

	@Override
	public void accept(ContextVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public String toString() {
		ToStringBuilder sb = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		sb.appendSuper(super.toString());
		sb.append("dictionaryIdentifier", dictionaryIdentifier);
		return sb.toString();
	}

}
