package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.query_tiles.QueryTile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oM3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8316oM3 {
    public final RL3 a;
    public final Callback b;
    public final InterfaceC4994ei1 c;

    public C8316oM3(RL3 rl3, C4191cM3 c4191cM3, C8285oG2 c8285oG2, C8628pG2 c8628pG2) {
        this.a = rl3;
        this.b = c8285oG2;
        this.c = c8628pG2;
        PropertyModel propertyModel = c4191cM3.h;
        propertyModel.o(InterfaceC4535dM3.a, new Callback() { // from class: mM3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                StringBuilder sb = new StringBuilder("Search.");
                C8316oM3 c8316oM3 = C8316oM3.this;
                sb.append(c8316oM3.a.a);
                sb.append(".Tile.Clicked");
                FI2.a(sb.toString());
                c8316oM3.b.onResult((QueryTile) obj);
            }
        });
        propertyModel.o(InterfaceC4535dM3.b, new InterfaceC4994ei1() { // from class: nM3
            @Override // defpackage.InterfaceC4994ei1
            public final void a(QueryTile queryTile, final Callback callback) {
                final C8316oM3 c8316oM3 = C8316oM3.this;
                c8316oM3.getClass();
                final long currentTimeMillis = System.currentTimeMillis();
                c8316oM3.c.a(queryTile, new Callback() { // from class: lM3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        List list = (List) obj;
                        C8316oM3 c8316oM32 = C8316oM3.this;
                        c8316oM32.getClass();
                        boolean z = (list == null || list.isEmpty()) ? false : true;
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb = new StringBuilder("Search.");
                        RL3 rl32 = c8316oM32.a;
                        sb.append(rl32.a);
                        sb.append(".Bitmap.Available");
                        EI2.b(sb.toString(), z);
                        StringBuilder sb2 = new StringBuilder("Search.");
                        sb2.append(rl32.a);
                        sb2.append(z ? ".Bitmap" : ".NoBitmap");
                        sb2.append(".FetchDuration");
                        EI2.n(currentTimeMillis2, sb2.toString());
                        callback.onResult(list);
                    }
                });
            }
        });
    }
}
