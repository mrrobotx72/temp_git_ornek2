package tr.edu.medipol.yazilimaraclari.ders7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public final void testBuyukHarfeCevir() {
		String ornek = "Merhaba Arkadaslar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("MERHABA ARKADASLAR", sonuc);	
	}
	
	@Test
	public final void testBuyukHarfeCevirNullKontrolu() {
		String ornek = null;
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals(null, sonuc);	
	}
	
	@Test
	public final void testBuyukHarfeCevirBosString() {
		String ornek = "";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("", sonuc);	
	}

}
