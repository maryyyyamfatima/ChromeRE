package org.chromium.components.omnibox;

import android.text.TextUtils;
import defpackage.C11901yp;
import defpackage.C12244zp;
import defpackage.C5348fk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.chromium.components.omnibox.action.OmniboxPedal;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AutocompleteMatch {
    public final int a;
    public final Set b;
    public final boolean c;
    public String d;
    public final List e;
    public String f;
    public final List g;
    public SuggestionAnswer h;
    public final String i;
    public GURL j;
    public final GURL k;
    public final String l;
    public final int m;
    public final int n;
    public final boolean o;
    public String p;
    public byte[] q;
    public final int r;
    public final List s;
    public byte[] t;
    public boolean u;
    public final List v;
    public long w;
    public final OmniboxPedal x;

    public AutocompleteMatch(int i, C5348fk c5348fk, boolean z, int i2, int i3, String str, ArrayList arrayList, String str2, ArrayList arrayList2, SuggestionAnswer suggestionAnswer, String str3, GURL gurl, GURL gurl2, String str4, boolean z2, String str5, byte[] bArr, int i4, List list, byte[] bArr2, boolean z3, ArrayList arrayList3, OmniboxPedal omniboxPedal) {
        int i5;
        Set set;
        if (c5348fk == null) {
            set = Collections.emptySet();
            i5 = i;
        } else {
            i5 = i;
            set = c5348fk;
        }
        this.a = i5;
        this.b = set;
        this.c = z;
        this.m = i2;
        this.n = i3;
        String str6 = str;
        this.d = str6;
        this.e = arrayList;
        this.f = str2;
        this.g = arrayList2;
        this.h = suggestionAnswer;
        this.i = TextUtils.isEmpty(str3) ? str6 : str3;
        this.j = gurl;
        this.k = gurl2;
        this.l = str4;
        this.o = z2;
        this.p = str5;
        this.q = bArr;
        this.r = i4;
        this.s = list;
        this.t = bArr2;
        this.u = z3;
        this.v = arrayList3;
        this.x = omniboxPedal;
    }

    public static AutocompleteMatch build(long j, int i, int[] iArr, boolean z, int i2, int i3, String str, int[] iArr2, int[] iArr3, String str2, int[] iArr4, int[] iArr5, SuggestionAnswer suggestionAnswer, String str3, GURL gurl, GURL gurl2, String str4, boolean z2, String str5, byte[] bArr, int i4, List list, byte[] bArr2, boolean z3, String[] strArr, GURL[] gurlArr, int[] iArr6, OmniboxPedal omniboxPedal) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < iArr2.length; i5++) {
            arrayList.add(new C11901yp(iArr2[i5], iArr3[i5]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < strArr.length; i6++) {
            arrayList2.add(new C12244zp(strArr[i6], gurlArr[i6], iArr6[i6] != 0));
        }
        C5348fk c5348fk = new C5348fk(iArr.length);
        for (int i7 : iArr) {
            c5348fk.add(Integer.valueOf(i7));
        }
        AutocompleteMatch autocompleteMatch = new AutocompleteMatch(i, c5348fk, z, i2, i3, str, arrayList, str2, new ArrayList(), suggestionAnswer, str3, gurl, gurl2, str4, z2, str5, bArr, i4, list, bArr2, z3, arrayList2, omniboxPedal);
        autocompleteMatch.updateNativeObjectRef(j);
        autocompleteMatch.setDescription(str2, iArr4, iArr5);
        return autocompleteMatch;
    }

    public final void updateNativeObjectRef(long j) {
        this.w = j;
    }

    public final void updateClipboardContent(String str, GURL gurl, String str2, byte[] bArr, byte[] bArr2) {
        this.d = str;
        this.j = gurl;
        this.p = str2;
        this.q = bArr;
        this.t = bArr2;
    }

    public final void destroy() {
        this.w = 0L;
    }

    public final void setDestinationUrl(GURL gurl) {
        this.j = gurl;
    }

    public final void setAnswer(SuggestionAnswer suggestionAnswer) {
        this.h = suggestionAnswer;
    }

    public final void setDescription(String str, int[] iArr, int[] iArr2) {
        this.f = str;
        List list = this.g;
        list.clear();
        for (int i = 0; i < iArr.length; i++) {
            list.add(new C11901yp(iArr[i], iArr2[i]));
        }
    }

    public final void updateMatchingTab(boolean z) {
        this.u = z;
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.i;
        int hashCode2 = ((str2 != null ? str2.hashCode() : 0) * 1901) + (hashCode * 2017) + (this.a * 37) + (this.o ? 1 : 0);
        SuggestionAnswer suggestionAnswer = this.h;
        return suggestionAnswer != null ? hashCode2 + suggestionAnswer.hashCode() : hashCode2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AutocompleteMatch)) {
            return false;
        }
        AutocompleteMatch autocompleteMatch = (AutocompleteMatch) obj;
        return this.a == autocompleteMatch.a && this.w == autocompleteMatch.w && Objects.equals(this.b, autocompleteMatch.b) && TextUtils.equals(this.i, autocompleteMatch.i) && TextUtils.equals(this.d, autocompleteMatch.d) && Objects.equals(this.e, autocompleteMatch.e) && TextUtils.equals(this.f, autocompleteMatch.f) && Objects.equals(this.g, autocompleteMatch.g) && this.o == autocompleteMatch.o && this.m == autocompleteMatch.m && Objects.equals(this.h, autocompleteMatch.h) && TextUtils.equals(this.p, autocompleteMatch.p) && Arrays.equals(this.q, autocompleteMatch.q) && this.r == autocompleteMatch.r && Objects.equals(this.s, autocompleteMatch.s);
    }

    public final String toString() {
        return Arrays.asList("mType=" + this.a, "mSubtypes=" + this.b.toString(), "mIsSearchType=" + this.c, "mDisplayText=" + this.d, "mDescription=" + this.f, "mFillIntoEdit=" + this.i, "mUrl=" + this.j, "mImageUrl=" + this.k, "mImageDominatColor=" + this.l, "mRelevance=" + this.m, "mTransition=" + this.n, "mIsDeletable=" + this.o, "mPostContentType=" + this.p, "mPostData=" + Arrays.toString(this.q), "mGroupId=" + this.r, "mDisplayTextClassifications=" + this.e, "mDescriptionClassifications=" + this.g, "mAnswer=" + this.h).toString();
    }
}
