package org.chromium.components.autofill_assistant;

import com.android.chrome.R;
import defpackage.C9813sk;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AssistantAutofillCreditCard {
    public static final C9813sk q = new C9813sk();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final long l;
    public final String m;
    public final GURL n;
    public final int o;
    public final String p;

    public static int getIssuerIconDrawableId(String str) {
        C9813sk c9813sk = q;
        return c9813sk.containsKey(str) ? ((Integer) c9813sk.get(str)).intValue() : R.drawable.f47240_resource_name_obfuscated_res_0x7f0901e0;
    }

    public AssistantAutofillCreditCard(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, long j, String str11, GURL gurl, int i2, String str12) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = j;
        this.m = str11;
        this.n = gurl;
        this.o = i2;
        this.p = str12;
    }

    public String getGUID() {
        return this.a;
    }

    public String getOrigin() {
        return this.b;
    }

    public boolean getIsLocal() {
        return this.c;
    }

    public boolean getIsCached() {
        return this.d;
    }

    public String getName() {
        return this.e;
    }

    public String getNumber() {
        return this.f;
    }

    public String getMonth() {
        return this.g;
    }

    public String getYear() {
        return this.h;
    }

    public String getBasicCardIssuerNetwork() {
        return this.i;
    }

    public String getBillingAddressId() {
        return this.j;
    }

    public String getServerId() {
        return this.k;
    }

    public long getInstrumentId() {
        return this.l;
    }

    public String getNickname() {
        return this.m;
    }

    public GURL getCardArtUrl() {
        return this.n;
    }

    public int getVirtualCardEnrollmentState() {
        return this.o;
    }

    public String getProductDescription() {
        return this.p;
    }
}
