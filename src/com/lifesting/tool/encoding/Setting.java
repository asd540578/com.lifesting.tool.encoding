package com.lifesting.tool.encoding;

import java.io.Serializable;

/**
 * <p>
 * �ļ�ת������ã�Ŀǰ������Լ��Ϊ��
 * <ul>
 * 	<li>ÿ���ļ�ֻ��һ��ת�����ã���suffixΪ�ؼ��֡�����jsp�ļ���GBKת��UTF-8��
 * 	<li>��<b>convertCharacter(�ļ��ַ���)</b>������Լ���������Ϊtrue����ô<br>
 * 	�ļ��ַ�����һ��ת������ֻ����Resource�ı��롣
 * </ul>
 * </p>
 * @author Bang
 *
 */
public class Setting implements Serializable{
	private static final long serialVersionUID = -6383589309965722363L;
	private String suffix;
	private String currentEncoding;
	private String convertedEncoding;
	private boolean convertCharacter;
	
	public boolean isConvertCharacter() {
		return convertCharacter;
	}
	public void setConvertCharacter(boolean convertCharacter) {
		this.convertCharacter = convertCharacter;
	}
	public Setting() {
		super();
	}
	public Setting(String suffix, String currentEncoding,
			String convertedEncoding, boolean convertCharacter) {
		super();
		this.suffix = suffix;
		this.currentEncoding = currentEncoding;
		this.convertedEncoding = convertedEncoding;
		this.convertCharacter = convertCharacter;
	}
	/**
	 * <p>
	 * �ļ���׺��html, jsp, java�ȡ�<BR>
	 * @Waring ����"."��
	 * </p>
	 * @return �ļ���׺
	 */
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	/**
	 * �ļ��ı���
	 * @return
	 */
	public String getCurrentEncoding() {
		return currentEncoding;
	}
	public void setCurrentEncoding(String currentEncoding) {
		this.currentEncoding = currentEncoding;
	}
	/**
	 * Ҫת���ɵ��ļ�����
	 * @return
	 */
	public String getConvertedEncoding() {
		return convertedEncoding;
	}
	public void setConvertedEncoding(String convertedEncoding) {
		this.convertedEncoding = convertedEncoding;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (convertCharacter ? 1231 : 1237);
		result = prime
				* result
				+ ((convertedEncoding == null) ? 0 : convertedEncoding
						.hashCode());
		result = prime * result
				+ ((currentEncoding == null) ? 0 : currentEncoding.hashCode());
		result = prime * result + ((suffix == null) ? 0 : suffix.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Setting other = (Setting) obj;
		if (convertCharacter != other.convertCharacter)
			return false;
		if (convertedEncoding == null) {
			if (other.convertedEncoding != null)
				return false;
		} else if (!convertedEncoding.equals(other.convertedEncoding))
			return false;
		if (currentEncoding == null) {
			if (other.currentEncoding != null)
				return false;
		} else if (!currentEncoding.equals(other.currentEncoding))
			return false;
		if (suffix == null) {
			if (other.suffix != null)
				return false;
		} else if (!suffix.equals(other.suffix))
			return false;
		return true;
	}
	
}
