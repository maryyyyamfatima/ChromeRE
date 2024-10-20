package org.chromium.components.autofill;

import android.graphics.Bitmap;
import com.android.chrome.R;
import defpackage.AbstractC7127ku0;
import java.util.Objects;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class AutofillSuggestion extends AbstractC7127ku0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final GURL k;
    public final Bitmap l;

    public AutofillSuggestion(String str, String str2, String str3, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, String str4, GURL gurl, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str4;
        this.k = gurl;
        this.l = bitmap;
    }

    @Override // defpackage.AbstractC7127ku0
    public final String d() {
        return this.a;
    }

    @Override // defpackage.AbstractC7127ku0
    public final String f() {
        return this.b;
    }

    @Override // defpackage.AbstractC7127ku0
    public final String c() {
        return this.c;
    }

    @Override // defpackage.AbstractC7127ku0
    public final int b() {
        return this.d;
    }

    @Override // defpackage.AbstractC7127ku0
    public final boolean k() {
        return this.h;
    }

    @Override // defpackage.AbstractC7127ku0
    public final boolean g() {
        return this.i;
    }

    @Override // defpackage.AbstractC7127ku0
    public final int e() {
        return this.f == -1 ? R.color.f22520_resource_name_obfuscated_res_0x7f0705b1 : R.color.f18190_resource_name_obfuscated_res_0x7f07014b;
    }

    @Override // defpackage.AbstractC7127ku0
    public final boolean j() {
        return this.e;
    }

    @Override // defpackage.AbstractC7127ku0
    public final Bitmap a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillSuggestion)) {
            return false;
        }
        AutofillSuggestion autofillSuggestion = (AutofillSuggestion) obj;
        if (this.a.equals(autofillSuggestion.a) && this.b.equals(autofillSuggestion.b) && Objects.equals(this.c, autofillSuggestion.c) && this.d == autofillSuggestion.d && this.e == autofillSuggestion.e && this.f == autofillSuggestion.f && this.g == autofillSuggestion.g && this.h == autofillSuggestion.h && this.i == autofillSuggestion.i && Objects.equals(this.j, autofillSuggestion.j) && Objects.equals(this.k, autofillSuggestion.k)) {
            Bitmap bitmap = autofillSuggestion.l;
            Bitmap bitmap2 = this.l;
            if (bitmap2 == null) {
                if (bitmap == null) {
                    return true;
                }
            } else if (bitmap2.sameAs(bitmap)) {
                return true;
            }
        }
        return false;
    }
}
