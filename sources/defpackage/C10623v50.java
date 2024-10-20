package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10623v50 implements InterfaceC10280u50 {
    public final ClipData a;
    public final int b;
    public final int c;
    public final Uri d;
    public final Bundle e;

    @Override // defpackage.InterfaceC10280u50
    public final ContentInfo i() {
        return null;
    }

    public C10623v50(C8566p50 c8566p50) {
        this.a = c8566p50.a;
        this.b = c8566p50.b;
        this.c = c8566p50.c;
        this.d = c8566p50.d;
        this.e = c8566p50.e;
    }

    @Override // defpackage.InterfaceC10280u50
    public final ClipData h() {
        return this.a;
    }

    @Override // defpackage.InterfaceC10280u50
    public final int j() {
        return this.b;
    }

    @Override // defpackage.InterfaceC10280u50
    public final int g() {
        return this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        if (i == 0) {
            str = "SOURCE_APP";
        } else if (i == 1) {
            str = "SOURCE_CLIPBOARD";
        } else if (i == 2) {
            str = "SOURCE_INPUT_METHOD";
        } else if (i == 3) {
            str = "SOURCE_DRAG_AND_DROP";
        } else if (i != 4) {
            str = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        } else {
            str = "SOURCE_AUTOFILL";
        }
        sb.append(str);
        sb.append(", flags=");
        int i2 = this.c;
        sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.d;
        if (uri == null) {
            str2 = "";
        } else {
            str2 = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb.append(str2);
        return Y5.a(sb, this.e != null ? ", hasExtras" : "", "}");
    }
}
