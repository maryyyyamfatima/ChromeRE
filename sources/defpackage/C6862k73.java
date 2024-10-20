package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6862k73 {
    public final WindowAndroid a;
    public final String b;
    public final String c;
    public final String d;
    public String e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    public final Uri i;
    public final Uri j;
    public final Boolean k;
    public final String l;
    public final String m;
    public InterfaceC6518j73 n;

    public C6862k73(WindowAndroid windowAndroid, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, Uri uri, Uri uri2, InterfaceC6518j73 interfaceC6518j73, Boolean bool, String str6, String str7) {
        this.a = windowAndroid;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = uri;
        this.j = uri2;
        this.n = interfaceC6518j73;
        this.k = bool;
        this.l = str6;
        this.m = str7;
    }

    public final String b() {
        String a = a();
        String str = this.e;
        return TextUtils.isEmpty(str) ? a : TextUtils.isEmpty(a) ? str : AbstractC8192o0.a(a, " ", str);
    }

    public final String a() {
        String str = this.c;
        String str2 = this.d;
        return str2 == null ? str : String.format(str2, str);
    }
}
