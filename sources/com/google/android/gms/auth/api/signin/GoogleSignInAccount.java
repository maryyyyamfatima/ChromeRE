package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4093c41;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C4093c41();
    public final int a;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Uri k;
    public String l;
    public final long m;
    public final String n;
    public final List o;
    public final String p;
    public final String q;
    public final HashSet r = new HashSet();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 2, this.g);
        RT2.o(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.o(parcel, 5, this.j);
        RT2.n(parcel, 6, this.k, i);
        RT2.o(parcel, 7, this.l);
        RT2.f(parcel, 8, 8);
        parcel.writeLong(this.m);
        RT2.o(parcel, 9, this.n);
        RT2.t(parcel, 10, this.o);
        RT2.o(parcel, 11, this.p);
        RT2.o(parcel, 12, this.q);
        RT2.b(a, parcel);
    }

    public static GoogleSignInAccount r1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = uri;
        this.l = str5;
        this.m = j;
        this.n = str6;
        this.o = arrayList;
        this.p = str7;
        this.q = str8;
    }

    public final int hashCode() {
        int hashCode = (this.n.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.o);
        hashSet.addAll(this.r);
        return hashSet.hashCode() + hashCode;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.n.equals(this.n)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.o);
        hashSet.addAll(googleSignInAccount.r);
        HashSet hashSet2 = new HashSet(this.o);
        hashSet2.addAll(this.r);
        return hashSet.equals(hashSet2);
    }
}
