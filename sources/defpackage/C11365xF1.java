package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11365xF1 implements InterfaceC9993tF1 {
    public final LocaleList a;

    public C11365xF1(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.InterfaceC9993tF1
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC9993tF1
    public final Locale get() {
        Locale locale;
        locale = this.a.get(0);
        return locale;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.a.equals(((InterfaceC9993tF1) obj).a());
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        String localeList;
        localeList = this.a.toString();
        return localeList;
    }
}
