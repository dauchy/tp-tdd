package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {

	@Test
	public void test_num2text_err () {
		Convert myConvert = new Convert();
		Assert.assertEquals(null, myConvert.num2text("fd12"));
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
	
	@Test
	public void test_num2text_vingt () {
		Convert myConvert = new Convert();
		Assert.assertEquals("vingt", myConvert.num2text("20"));
	}
	
	@Test
	public void test_num2text_trente () {
		Convert myConvert = new Convert();
		Assert.assertEquals("trente", myConvert.num2text("30"));
	}
	
	@Test
	public void test_num2text_quarante () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quarante", myConvert.num2text("40"));
	}
	
	@Test
	public void test_num2text_cinquante () {
		Convert myConvert = new Convert();
		Assert.assertEquals("cinquante", myConvert.num2text("50"));
	}
	
	@Test
	public void test_num2text_soixante () {
		Convert myConvert = new Convert();
		Assert.assertEquals("soixante", myConvert.num2text("60"));
	}
	
	@Test
	public void test_num2text_soixante_dix () {
		Convert myConvert = new Convert();
		Assert.assertEquals("soixante-dix", myConvert.num2text("70"));
	}
	
	@Test
	public void test_num2text_quatre_vingt () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quatre-vingt", myConvert.num2text("80"));
	}
	
	@Test
	public void test_num2text_quatre_vingt_dix () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quatre-vingt-dix", myConvert.num2text("90"));
	}
	
	@Test
	public void test_num2text_vingt_et_un () {
		Convert myConvert = new Convert();
		Assert.assertEquals("vingt-et-un", myConvert.num2text("21"));
	}
	
	@Test
	public void test_num2text_vingt_deux () {
		Convert myConvert = new Convert();
		Assert.assertEquals("vingt-deux", myConvert.num2text("22"));
	}
	
	@Test
	public void test_num2text_soixante_douze () {
		Convert myConvert = new Convert();
		Assert.assertEquals("soixante-douze", myConvert.num2text("72"));
	}
	
	@Test
	public void test_num2text_quatre_vingt_dix_sept () {
		Convert myConvert = new Convert();
		Assert.assertEquals("quatre-vingt-dix-sept", myConvert.num2text("97"));
	}
	
	@Test
	public void test_num2text_cent_quarante_deux () {
		Convert myConvert = new Convert();
		Assert.assertEquals("cent quarante-deux", myConvert.num2text("142"));
	}
	
	@Test
	public void test_num2text_quatre_cents_cinquante_deux() {
		Convert myConvert = new Convert();
		Assert.assertEquals("quatre cents cinquante-deux", myConvert.num2text("452"));
	}
	
	@Test
	public void test_num2text_cent() {
		Convert myConvert = new Convert();
		Assert.assertEquals("cent", myConvert.num2text("100"));
	}
	
	@Test
	public void test_num2text_trois_cent() {
		Convert myConvert = new Convert();
		Assert.assertEquals("trois cents", myConvert.num2text("300"));
	}
	
	@Test
	public void test_num2text_zerosix() {
		Assert.assertEquals("six", Convert.num2text(" 06"));
	}
	
	@Test
	public void test_num2text_sixzero() {
		Assert.assertEquals("six", Convert.num2text("06 "));
	}
	
	@Test
	public void test_num2text_999_99() {
		Assert.assertEquals("neuf cents quatre-vingt-dix-neuf virgule quatre-vingt-dix-neuf", Convert.num2text("999,99"));
	}
	
	@Test
	public void test_num2text_6_4() {
		Assert.assertEquals("six virgule quarante", Convert.num2text("6,4"));
	}
	
	@Test
	public void test_num2text_6_444() {
		Assert.assertEquals("six virgule quarante-quatre", Convert.num2text("6,444"));
	}
	
	@Test
	public void test_num2text_6e4() {
		Assert.assertEquals("six euro quarante", Convert.num2text("6,4€"));
	}
	
	@Test
	public void test_num2text_6s4() {
		Assert.assertEquals("six dollar quarante", Convert.num2text("$6,4"));
	}
}
