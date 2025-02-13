/*******************************************************************************
 * Copyright (c) 2013 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.emitter.pptx.writer;

import java.io.IOException;

import org.eclipse.birt.report.engine.ooxml.IPart;
import org.eclipse.birt.report.engine.ooxml.constants.ContentTypes;
import org.eclipse.birt.report.engine.ooxml.constants.NameSpaces;
import org.eclipse.birt.report.engine.ooxml.constants.RelationshipTypes;

public class Theme extends Component {

	public Theme(IPart parent, Presentation presentation) throws IOException {
		String type = ContentTypes.THEME;
		String relationship = RelationshipTypes.THEME;
		String uri = "theme/theme" + presentation.getNextThemeId() + ".xml";
		initialize(parent, uri, type, relationship, false);
		writer.startWriter();
		writer.openTag("a:theme");
		writer.nameSpace("a", NameSpaces.DRAWINGML);
		writer.attribute("name", "Office Theme");
		writer.openTag("a:themeElements");
		writer.openTag("a:clrScheme");
		writer.attribute("name", "Office");
		writer.openTag("a:dk1");
		writer.openTag("a:sysClr");
		writer.attribute("val", "windowText");
		writer.attribute("lastClr", "000000");
		writer.closeTag("a:sysClr");
		writer.closeTag("a:dk1");
		writer.openTag("a:lt1");
		writer.openTag("a:sysClr");
		writer.attribute("val", "window");
		writer.attribute("lastClr", "FFFFFF");
		writer.closeTag("a:sysClr");
		writer.closeTag("a:lt1");
		writer.openTag("a:dk2");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "1F497D");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:dk2");
		writer.openTag("a:lt2");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "EEECE1");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:lt2");
		writer.openTag("a:accent1");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "4F81BD");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:accent1");
		writer.openTag("a:accent2");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "C0504D");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:accent2");
		writer.openTag("a:accent3");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "9BBB59");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:accent3");
		writer.openTag("a:accent4");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "8064A2");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:accent4");
		writer.openTag("a:accent5");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "4BACC6");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:accent5");
		writer.openTag("a:accent6");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "F79646");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:accent6");
		writer.openTag("a:hlink");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "0000FF");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:hlink");
		writer.openTag("a:folHlink");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "800080");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:folHlink");
		writer.closeTag("a:clrScheme");
		writer.openTag("a:fontScheme");
		writer.attribute("name", "Office");
		writer.openTag("a:majorFont");
		writer.openTag("a:latin");
		writer.attribute("typeface", "Calibri");
		writer.closeTag("a:latin");
		writer.openTag("a:ea");
		writer.attribute("typeface", "");
		writer.closeTag("a:ea");
		writer.openTag("a:cs");
		writer.attribute("typeface", "");
		writer.closeTag("a:cs");
		writer.openTag("a:font");
		writer.attribute("script", "Jpan");
		writer.attribute("typeface", "ＭＳ Ｐゴシック");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hang");
		writer.attribute("typeface", "맑은 고딕");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hans");
		writer.attribute("typeface", "宋体");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hant");
		writer.attribute("typeface", "新細明體");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Arab");
		writer.attribute("typeface", "Times New Roman");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hebr");
		writer.attribute("typeface", "Times New Roman");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Thai");
		writer.attribute("typeface", "Angsana New");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Ethi");
		writer.attribute("typeface", "Nyala");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Beng");
		writer.attribute("typeface", "Vrinda");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Gujr");
		writer.attribute("typeface", "Shruti");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Khmr");
		writer.attribute("typeface", "MoolBoran");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Knda");
		writer.attribute("typeface", "Tunga");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Guru");
		writer.attribute("typeface", "Raavi");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Cans");
		writer.attribute("typeface", "Euphemia");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Cher");
		writer.attribute("typeface", "Plantagenet Cherokee");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Yiii");
		writer.attribute("typeface", "Microsoft Yi Baiti");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Tibt");
		writer.attribute("typeface", "Microsoft Himalaya");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Thaa");
		writer.attribute("typeface", "MV Boli");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Deva");
		writer.attribute("typeface", "Mangal");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Telu");
		writer.attribute("typeface", "Gautami");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Taml");
		writer.attribute("typeface", "Latha");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Syrc");
		writer.attribute("typeface", "Estrangelo Edessa");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Orya");
		writer.attribute("typeface", "Kalinga");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Mlym");
		writer.attribute("typeface", "Kartika");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Laoo");
		writer.attribute("typeface", "DokChampa");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Sinh");
		writer.attribute("typeface", "Iskoola Pota");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Mong");
		writer.attribute("typeface", "Mongolian Baiti");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Viet");
		writer.attribute("typeface", "Times New Roman");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Uigh");
		writer.attribute("typeface", "Microsoft Uighur");
		writer.closeTag("a:font");
		writer.closeTag("a:majorFont");
		writer.openTag("a:minorFont");
		writer.openTag("a:latin");
		writer.attribute("typeface", "Calibri");
		writer.closeTag("a:latin");
		writer.openTag("a:ea");
		writer.attribute("typeface", "");
		writer.closeTag("a:ea");
		writer.openTag("a:cs");
		writer.attribute("typeface", "");
		writer.closeTag("a:cs");
		writer.openTag("a:font");
		writer.attribute("script", "Jpan");
		writer.attribute("typeface", "ＭＳ Ｐゴシック");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hang");
		writer.attribute("typeface", "맑은 고딕");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hans");
		writer.attribute("typeface", "宋体");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hant");
		writer.attribute("typeface", "新細明體");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Arab");
		writer.attribute("typeface", "Arial");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Hebr");
		writer.attribute("typeface", "Arial");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Thai");
		writer.attribute("typeface", "Cordia New");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Ethi");
		writer.attribute("typeface", "Nyala");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Beng");
		writer.attribute("typeface", "Vrinda");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Gujr");
		writer.attribute("typeface", "Shruti");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Khmr");
		writer.attribute("typeface", "DaunPenh");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Knda");
		writer.attribute("typeface", "Tunga");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Guru");
		writer.attribute("typeface", "Raavi");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Cans");
		writer.attribute("typeface", "Euphemia");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Cher");
		writer.attribute("typeface", "Plantagenet Cherokee");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Yiii");
		writer.attribute("typeface", "Microsoft Yi Baiti");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Tibt");
		writer.attribute("typeface", "Microsoft Himalaya");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Thaa");
		writer.attribute("typeface", "MV Boli");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Deva");
		writer.attribute("typeface", "Mangal");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Telu");
		writer.attribute("typeface", "Gautami");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Taml");
		writer.attribute("typeface", "Latha");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Syrc");
		writer.attribute("typeface", "Estrangelo Edessa");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Orya");
		writer.attribute("typeface", "Kalinga");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Mlym");
		writer.attribute("typeface", "Kartika");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Laoo");
		writer.attribute("typeface", "DokChampa");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Sinh");
		writer.attribute("typeface", "Iskoola Pota");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Mong");
		writer.attribute("typeface", "Mongolian Baiti");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Viet");
		writer.attribute("typeface", "Arial");
		writer.closeTag("a:font");
		writer.openTag("a:font");
		writer.attribute("script", "Uigh");
		writer.attribute("typeface", "Microsoft Uighur");
		writer.closeTag("a:font");
		writer.closeTag("a:minorFont");
		writer.closeTag("a:fontScheme");
		writer.openTag("a:fmtScheme");
		writer.attribute("name", "Office");
		writer.openTag("a:fillStyleLst");
		writer.openTag("a:solidFill");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:solidFill");
		writer.openTag("a:gradFill");
		writer.attribute("rotWithShape", "1");
		writer.openTag("a:gsLst");
		writer.openTag("a:gs");
		writer.attribute("pos", "0");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:tint");
		writer.attribute("val", "50000");
		writer.closeTag("a:tint");
		writer.openTag("a:satMod");
		writer.attribute("val", "300000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "35000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:tint");
		writer.attribute("val", "37000");
		writer.closeTag("a:tint");
		writer.openTag("a:satMod");
		writer.attribute("val", "300000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "100000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:tint");
		writer.attribute("val", "15000");
		writer.closeTag("a:tint");
		writer.openTag("a:satMod");
		writer.attribute("val", "350000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.closeTag("a:gsLst");
		writer.openTag("a:lin");
		writer.attribute("ang", "16200000");
		writer.attribute("scaled", "1");
		writer.closeTag("a:lin");
		writer.closeTag("a:gradFill");
		writer.openTag("a:gradFill");
		writer.attribute("rotWithShape", "1");
		writer.openTag("a:gsLst");
		writer.openTag("a:gs");
		writer.attribute("pos", "0");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:shade");
		writer.attribute("val", "51000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "130000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "80000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:shade");
		writer.attribute("val", "93000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "130000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "100000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:shade");
		writer.attribute("val", "94000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "135000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.closeTag("a:gsLst");
		writer.openTag("a:lin");
		writer.attribute("ang", "16200000");
		writer.attribute("scaled", "0");
		writer.closeTag("a:lin");
		writer.closeTag("a:gradFill");
		writer.closeTag("a:fillStyleLst");
		writer.openTag("a:lnStyleLst");
		writer.openTag("a:ln");
		writer.attribute("w", "9525");
		writer.attribute("cap", "flat");
		writer.attribute("cmpd", "sng");
		writer.attribute("algn", "ctr");
		writer.openTag("a:solidFill");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:shade");
		writer.attribute("val", "95000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "105000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:solidFill");
		writer.openTag("a:prstDash");
		writer.attribute("val", "solid");
		writer.closeTag("a:prstDash");
		writer.closeTag("a:ln");
		writer.openTag("a:ln");
		writer.attribute("w", "25400");
		writer.attribute("cap", "flat");
		writer.attribute("cmpd", "sng");
		writer.attribute("algn", "ctr");
		writer.openTag("a:solidFill");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:solidFill");
		writer.openTag("a:prstDash");
		writer.attribute("val", "solid");
		writer.closeTag("a:prstDash");
		writer.closeTag("a:ln");
		writer.openTag("a:ln");
		writer.attribute("w", "38100");
		writer.attribute("cap", "flat");
		writer.attribute("cmpd", "sng");
		writer.attribute("algn", "ctr");
		writer.openTag("a:solidFill");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:solidFill");
		writer.openTag("a:prstDash");
		writer.attribute("val", "solid");
		writer.closeTag("a:prstDash");
		writer.closeTag("a:ln");
		writer.closeTag("a:lnStyleLst");
		writer.openTag("a:effectStyleLst");
		writer.openTag("a:effectStyle");
		writer.openTag("a:effectLst");
		writer.openTag("a:outerShdw");
		writer.attribute("blurRad", "40000");
		writer.attribute("dist", "20000");
		writer.attribute("dir", "5400000");
		writer.attribute("rotWithShape", "0");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "000000");
		writer.openTag("a:alpha");
		writer.attribute("val", "38000");
		writer.closeTag("a:alpha");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:outerShdw");
		writer.closeTag("a:effectLst");
		writer.closeTag("a:effectStyle");
		writer.openTag("a:effectStyle");
		writer.openTag("a:effectLst");
		writer.openTag("a:outerShdw");
		writer.attribute("blurRad", "40000");
		writer.attribute("dist", "23000");
		writer.attribute("dir", "5400000");
		writer.attribute("rotWithShape", "0");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "000000");
		writer.openTag("a:alpha");
		writer.attribute("val", "35000");
		writer.closeTag("a:alpha");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:outerShdw");
		writer.closeTag("a:effectLst");
		writer.closeTag("a:effectStyle");
		writer.openTag("a:effectStyle");
		writer.openTag("a:effectLst");
		writer.openTag("a:outerShdw");
		writer.attribute("blurRad", "40000");
		writer.attribute("dist", "23000");
		writer.attribute("dir", "5400000");
		writer.attribute("rotWithShape", "0");
		writer.openTag("a:srgbClr");
		writer.attribute("val", "000000");
		writer.openTag("a:alpha");
		writer.attribute("val", "35000");
		writer.closeTag("a:alpha");
		writer.closeTag("a:srgbClr");
		writer.closeTag("a:outerShdw");
		writer.closeTag("a:effectLst");
		writer.openTag("a:scene3d");
		writer.openTag("a:camera");
		writer.attribute("prst", "orthographicFront");
		writer.openTag("a:rot");
		writer.attribute("lat", "0");
		writer.attribute("lon", "0");
		writer.attribute("rev", "0");
		writer.closeTag("a:rot");
		writer.closeTag("a:camera");
		writer.openTag("a:lightRig");
		writer.attribute("rig", "threePt");
		writer.attribute("dir", "t");
		writer.openTag("a:rot");
		writer.attribute("lat", "0");
		writer.attribute("lon", "0");
		writer.attribute("rev", "1200000");
		writer.closeTag("a:rot");
		writer.closeTag("a:lightRig");
		writer.closeTag("a:scene3d");
		writer.openTag("a:sp3d");
		writer.openTag("a:bevelT");
		writer.attribute("w", "63500");
		writer.attribute("h", "25400");
		writer.closeTag("a:bevelT");
		writer.closeTag("a:sp3d");
		writer.closeTag("a:effectStyle");
		writer.closeTag("a:effectStyleLst");
		writer.openTag("a:bgFillStyleLst");
		writer.openTag("a:solidFill");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:solidFill");
		writer.openTag("a:gradFill");
		writer.attribute("rotWithShape", "1");
		writer.openTag("a:gsLst");
		writer.openTag("a:gs");
		writer.attribute("pos", "0");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:tint");
		writer.attribute("val", "40000");
		writer.closeTag("a:tint");
		writer.openTag("a:satMod");
		writer.attribute("val", "350000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "40000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:tint");
		writer.attribute("val", "45000");
		writer.closeTag("a:tint");
		writer.openTag("a:shade");
		writer.attribute("val", "99000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "350000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "100000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:shade");
		writer.attribute("val", "20000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "255000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.closeTag("a:gsLst");
		writer.openTag("a:path");
		writer.attribute("path", "circle");
		writer.openTag("a:fillToRect");
		writer.attribute("l", "50000");
		writer.attribute("t", "-80000");
		writer.attribute("r", "50000");
		writer.attribute("b", "180000");
		writer.closeTag("a:fillToRect");
		writer.closeTag("a:path");
		writer.closeTag("a:gradFill");
		writer.openTag("a:gradFill");
		writer.attribute("rotWithShape", "1");
		writer.openTag("a:gsLst");
		writer.openTag("a:gs");
		writer.attribute("pos", "0");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:tint");
		writer.attribute("val", "80000");
		writer.closeTag("a:tint");
		writer.openTag("a:satMod");
		writer.attribute("val", "300000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.openTag("a:gs");
		writer.attribute("pos", "100000");
		writer.openTag("a:schemeClr");
		writer.attribute("val", "phClr");
		writer.openTag("a:shade");
		writer.attribute("val", "30000");
		writer.closeTag("a:shade");
		writer.openTag("a:satMod");
		writer.attribute("val", "200000");
		writer.closeTag("a:satMod");
		writer.closeTag("a:schemeClr");
		writer.closeTag("a:gs");
		writer.closeTag("a:gsLst");
		writer.openTag("a:path");
		writer.attribute("path", "circle");
		writer.openTag("a:fillToRect");
		writer.attribute("l", "50000");
		writer.attribute("t", "50000");
		writer.attribute("r", "50000");
		writer.attribute("b", "50000");
		writer.closeTag("a:fillToRect");
		writer.closeTag("a:path");
		writer.closeTag("a:gradFill");
		writer.closeTag("a:bgFillStyleLst");
		writer.closeTag("a:fmtScheme");
		writer.closeTag("a:themeElements");
		writer.openTag("a:objectDefaults");
		writer.closeTag("a:objectDefaults");
		writer.openTag("a:extraClrSchemeLst");
		writer.closeTag("a:extraClrSchemeLst");
		writer.closeTag("a:theme");
		writer.endWriter();
		writer.close();
		this.writer = null;
	}
}
