package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {

	@Test
	public void test_num2text_err () {
		Convert myConvert = new Convert();
		Assert.assertEquals(null, myConvert.num2text("fdg12"));
	}
	
	@Test
	public void test_num2text_zero () {
		Convert myConvert = new Convert();
		Assert.assertEquals("zéro", myConvert.num2text("0"));
	}
	
	@Test
	public void test_num2text_un () {
		Convert myConvert = new Convert();
		Assert.assertEquals("un", myConvert.num2text("1"));
	}
	
	@Test
	public void test_num2text_deux () {
		Convert myConvert = new Convert();
		Assert.assertEquals("deux", myConvert.num2text("2"));
	}
	
	@Test
	public void test_num2text_trois () {
		Convert myConvert = new Convert();
		Assert.assertEquals("trois", myConvert.num2text("3"));
	}
	
	@Test
	public void test_num2text_quatre () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quatre", myConvert.num2text("4"));
	}
	
	@Test
	public void test_num2text_cinq () {
		Convert myConvert = new Convert();
		Assert.assertEquals("cinq", myConvert.num2text("5"));
	}
	
}
