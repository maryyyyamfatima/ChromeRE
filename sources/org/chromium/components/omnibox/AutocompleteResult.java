package org.chromium.components.omnibox;

import J.N;
import android.util.SparseArray;
import defpackage.C1375Kp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AutocompleteResult {
    public static final AutocompleteResult e = new AutocompleteResult(0, Collections.emptyList(), null);
    public final SparseArray a;
    public final List b;
    public final boolean c;
    public long d;

    public AutocompleteResult(long j, List list, SparseArray sparseArray) {
        this.c = j == 0;
        this.d = j;
        this.b = list == null ? new ArrayList() : list;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }

    public static AutocompleteResult fromNative(long j, AutocompleteMatch[] autocompleteMatchArr, int[] iArr, String[] strArr, boolean[] zArr) {
        SparseArray sparseArray = new SparseArray(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            sparseArray.put(iArr[i], new C1375Kp(strArr[i], zArr[i]));
        }
        AutocompleteResult autocompleteResult = new AutocompleteResult(j, null, sparseArray);
        autocompleteResult.updateMatches(autocompleteMatchArr);
        return autocompleteResult;
    }

    public final void updateMatches(AutocompleteMatch[] autocompleteMatchArr) {
        List list = this.b;
        list.clear();
        Collections.addAll(list, autocompleteMatchArr);
    }

    public void notifyNativeDestroyed() {
        this.d = 0L;
    }

    public final boolean a(int i, int i2) {
        if (this.d == 0) {
            return false;
        }
        List list = this.b;
        long[] jArr = new long[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            jArr[i3] = ((AutocompleteMatch) list.get(i3)).w;
        }
        return N.M__nk0t1(this.d, jArr, i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutocompleteResult)) {
            return false;
        }
        AutocompleteResult autocompleteResult = (AutocompleteResult) obj;
        if (!this.b.equals(autocompleteResult.b)) {
            return false;
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        SparseArray sparseArray2 = autocompleteResult.a;
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            if (sparseArray.keyAt(i) != sparseArray2.keyAt(i) || !Objects.equals(sparseArray.valueAt(i), sparseArray2.valueAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i < sparseArray.size()) {
                i2 = Integer.rotateLeft(((C1375Kp) sparseArray.valueAt(i)).hashCode() ^ (sparseArray.keyAt(i) + i2), 10);
                i++;
            } else {
                return this.b.hashCode() ^ i2;
            }
        }
    }
}
