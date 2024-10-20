package org.chromium.chrome.browser.autofill.settings;

import android.graphics.Bitmap;
import defpackage.C10245tz1;
import defpackage.C9902sz1;
import java.util.LinkedList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VirtualCardEnrollmentFields {
    public final LinkedList a = new LinkedList();
    public final LinkedList b = new LinkedList();
    public final Bitmap c;
    public final String d;

    public VirtualCardEnrollmentFields(Bitmap bitmap, String str) {
        this.d = str;
        this.c = bitmap;
    }

    public static VirtualCardEnrollmentFields create(String str, Bitmap bitmap) {
        return new VirtualCardEnrollmentFields(bitmap, str);
    }

    public final void addGoogleLegalMessageLine(String str) {
        this.a.add(new C10245tz1(str));
    }

    public final void addLinkToLastGoogleLegalMessageLine(int i, int i2, String str) {
        ((C10245tz1) this.a.getLast()).b.add(new C9902sz1(i, i2, str));
    }

    public final void addIssuerLegalMessageLine(String str) {
        this.b.add(new C10245tz1(str));
    }

    public final void addLinkToLastIssuerLegalMessageLine(int i, int i2, String str) {
        ((C10245tz1) this.b.getLast()).b.add(new C9902sz1(i, i2, str));
    }
}
