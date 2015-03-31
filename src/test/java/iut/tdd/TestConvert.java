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
	
	@Test
	public void test_num2text_six () {
		Convert myConvert = new Convert();
		Assert.assertEquals("six", myConvert.num2text("6"));
	}
	
	@Test
	public void test_num2text_sept () {
		Convert myConvert = new Convert();
		Assert.assertEquals("sept", myConvert.num2text("7"));
	}
	
	@Test
	public void test_num2text_huit () {
		Convert myConvert = new Convert();
		Assert.assertEquals("huit", myConvert.num2text("8"));
	}
	
	@Test
	public void test_num2text_neuf () {
		Convert myConvert = new Convert();
		Assert.assertEquals("neuf", myConvert.num2text("9"));
	}
	
	@Test
	public void test_num2text_dix () {
		Convert myConvert = new Convert();
		Assert.assertEquals("dix", myConvert.num2text("10"));
	}
	
	@Test
	public void test_num2text_onze () {
		Convert myConvert = new Convert();
		Assert.assertEquals("onze", myConvert.num2text("11"));
	}
	
	@Test
	public void test_num2text_douze () {
		Convert myConvert = new Convert();
		Assert.assertEquals("douze", myConvert.num2text("12"));
	}
	
	@Test
	public void test_num2text_treize () {
		Convert myConvert = new Convert();
		Assert.assertEquals("treize", myConvert.num2text("13"));
	}
	
	@Test
	public void test_num2text_quatorze () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quatorze", myConvert.num2text("14"));
	}
	
	@Test
	public void test_num2text_quinze () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quinze", myConvert.num2text("15"));
	}
	
	@Test
	public void test_num2text_seize () {
		Convert myConvert = new Convert();
		Assert.assertEquals("seize", myConvert.num2text("16"));
	}
	
	@Test
	public void test_num2text_dix_sept () {
		Convert myConvert = new Convert();
		Assert.assertEquals("dix-sept", myConvert.num2text("17"));
	}
	
}
