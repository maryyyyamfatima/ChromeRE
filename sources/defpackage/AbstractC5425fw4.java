package defpackage;

import android.content.res.XmlResourceParser;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fw4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5425fw4 {
    public static C4045bv4 a;

    public static String a(String str, XmlResourceParser xmlResourceParser) {
        for (int i = 0; i < xmlResourceParser.getAttributeCount(); i++) {
            if (xmlResourceParser.getAttributeName(i).equals(str)) {
                return xmlResourceParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static void b(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
