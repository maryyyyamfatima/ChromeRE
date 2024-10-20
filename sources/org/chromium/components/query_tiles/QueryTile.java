package org.chromium.components.query_tiles;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QueryTile {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    public QueryTile(String str, String str2, String str3, String str4, GURL[] gurlArr, String[] strArr, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.f = Arrays.asList(gurlArr);
        this.g = strArr == null ? new ArrayList() : Arrays.asList(strArr);
        this.e = Collections.unmodifiableList(list == null ? new ArrayList() : list);
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof QueryTile)) {
            return false;
        }
        QueryTile queryTile = (QueryTile) obj;
        return TextUtils.equals(this.a, queryTile.a) && TextUtils.equals(this.b, queryTile.b) && TextUtils.equals(this.c, queryTile.c);
    }

    public final boolean equals(Object obj) {
        if (!a(obj) || !(obj instanceof QueryTile)) {
            return false;
        }
        QueryTile queryTile = (QueryTile) obj;
        if (!TextUtils.equals(this.d, queryTile.d)) {
            return false;
        }
        List list = this.e;
        List list2 = queryTile.e;
        if (list != null && !list.equals(list2)) {
            return false;
        }
        if (list == null && list2 != null) {
            return false;
        }
        List list3 = this.f;
        List list4 = queryTile.f;
        if (list3 == null || list3.equals(list4)) {
            return list3 != null || list4 == null;
        }
        return false;
    }
}
