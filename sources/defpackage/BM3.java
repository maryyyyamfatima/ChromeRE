package defpackage;

import java.util.List;
import org.chromium.components.query_tiles.QueryTile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BM3 {
    public List a;

    public static int a(QueryTile queryTile, String str, int i) {
        if (str.equals(queryTile.a)) {
            return i;
        }
        int i2 = (i + 1) * 100;
        int i3 = 0;
        while (true) {
            List list = queryTile.e;
            if (i3 >= list.size()) {
                return -1;
            }
            int a = a((QueryTile) list.get(i3), str, i2 + i3);
            if (a != -1) {
                return a;
            }
            i3++;
        }
    }
}
