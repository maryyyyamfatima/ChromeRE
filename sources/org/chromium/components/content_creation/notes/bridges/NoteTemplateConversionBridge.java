package org.chromium.components.content_creation.notes.bridges;

import defpackage.C1591Mg1;
import defpackage.C6702jg3;
import defpackage.KB1;
import java.util.ArrayList;
import java.util.List;
import org.chromium.components.content_creation.notes.models.Background;
import org.chromium.components.content_creation.notes.models.FooterStyle;
import org.chromium.components.content_creation.notes.models.NoteTemplate;
import org.chromium.components.content_creation.notes.models.TextStyle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NoteTemplateConversionBridge {
    public static List createTemplateList() {
        return new ArrayList();
    }

    public static Background createBackground(int i) {
        return new C6702jg3(i);
    }

    public static Background createLinearGradientBackground(int[] iArr, int i) {
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    i2 = i != 4 ? 1 : 5;
                }
            } else {
                i2 = 3;
            }
        }
        return new KB1(iArr, i2);
    }

    public static Background createImageBackground(String str) {
        return new C1591Mg1(str);
    }

    public static TextStyle createTextStyle(String str, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9 = i3 != 1 ? i3 != 2 ? i3 != 3 ? 1 : 4 : 3 : 2;
        if (i7 != 0) {
            if (i7 == 1) {
                i8 = 2;
            } else if (i7 == 2) {
                i8 = 3;
            }
            return new TextStyle(str, i, i2, z, i9, i4, i5, i6, i8);
        }
        i8 = 1;
        return new TextStyle(str, i, i2, z, i9, i4, i5, i6, i8);
    }

    public static FooterStyle createFooterStyle(int i, int i2) {
        return new FooterStyle(i, i2);
    }

    public static NoteTemplate createTemplateAndMaybeAddToList(List list, int i, String str, Background background, Background background2, TextStyle textStyle, FooterStyle footerStyle) {
        NoteTemplate noteTemplate = new NoteTemplate(i, str, background, background2, textStyle, footerStyle);
        if (list != null) {
            list.add(noteTemplate);
        }
        return noteTemplate;
    }
}
