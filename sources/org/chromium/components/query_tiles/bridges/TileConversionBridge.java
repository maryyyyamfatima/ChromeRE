package org.chromium.components.query_tiles.bridges;

import java.util.ArrayList;
import java.util.List;
import org.chromium.components.query_tiles.QueryTile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TileConversionBridge {
    public static List createList() {
        return new ArrayList();
    }

    public static QueryTile createTileAndMaybeAddToList(List list, String str, String str2, String str3, String str4, GURL[] gurlArr, String[] strArr, List list2) {
        QueryTile queryTile = new QueryTile(str, str2, str3, str4, gurlArr, strArr, list2);
        if (list != null) {
            list.add(queryTile);
        }
        return queryTile;
    }
}
