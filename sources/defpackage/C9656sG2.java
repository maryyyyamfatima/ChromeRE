package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.components.query_tiles.QueryTile;
import org.chromium.components.query_tiles.bridges.TileProviderBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9656sG2 {
    public final ViewGroup a;
    public final Callback b;
    public final SL3 c;
    public final TileProviderBridge d;
    public final BM3 e;
    public final ImageFetcher f;
    public Integer g;
    public float h;
    public boolean i = true;

    /* JADX WARN: Type inference failed for: r1v0, types: [oG2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [pG2] */
    public C9656sG2(ViewGroup viewGroup, Profile profile, Callback callback) {
        this.a = viewGroup;
        this.b = callback;
        this.d = (TileProviderBridge) N.MnrpS$PN(profile);
        QL3 ql3 = new QL3();
        ql3.a = "QueryTiles.NTP";
        RL3 rl3 = new RL3(ql3);
        this.e = new BM3();
        SL3 sl3 = new SL3(viewGroup.getContext(), rl3, new Callback() { // from class: oG2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i;
                boolean z;
                String str;
                int i2;
                QueryTile queryTile = (QueryTile) obj;
                C9656sG2 c9656sG2 = C9656sG2.this;
                BM3 bm3 = c9656sG2.e;
                bm3.getClass();
                String str2 = queryTile.a;
                Iterator it = bm3.a.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((QueryTile) it.next()).a.equals(str2)) {
                        z = true;
                        break;
                    }
                }
                EI2.b("Search.QueryTiles.NTP.Tile.Clicked.IsTopLevel", z);
                while (true) {
                    int size = bm3.a.size();
                    str = queryTile.a;
                    i2 = -1;
                    if (i >= size) {
                        break;
                    }
                    int a = BM3.a((QueryTile) bm3.a.get(i), str, i);
                    if (a != -1) {
                        i2 = a;
                        break;
                    }
                    i++;
                }
                EI2.m(i2, "Search.QueryTiles.NTP.Tile.Clicked");
                TileProviderBridge tileProviderBridge = c9656sG2.d;
                long j = tileProviderBridge.a;
                if (j != 0) {
                    N.MgiexKaR(j, str);
                }
                AbstractC9999tG2.c("Chrome.Querytiles.RecentQueryTileClicks");
                if (queryTile.e.isEmpty()) {
                    c9656sG2.b.onResult(new C9313rG2(queryTile.d, queryTile.g));
                    return;
                }
                c9656sG2.i = true;
                C8971qG2 c8971qG2 = new C8971qG2(c9656sG2);
                long j2 = tileProviderBridge.a;
                if (j2 == 0) {
                    return;
                }
                N.Mq1q5_mC(j2, tileProviderBridge, str, c8971qG2);
            }
        }, new InterfaceC4994ei1() { // from class: pG2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [mG2, org.chromium.base.Callback] */
            @Override // defpackage.InterfaceC4994ei1
            public final void a(QueryTile queryTile, final Callback callback2) {
                C9656sG2 c9656sG2 = C9656sG2.this;
                if (c9656sG2.g == null) {
                    c9656sG2.g = Integer.valueOf(c9656sG2.a.getResources().getDimensionPixelSize(R.dimen.f41980_resource_name_obfuscated_res_0x7f0807e3));
                }
                int intValue = c9656sG2.g.intValue();
                final ?? r1 = new Callback() { // from class: mG2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Callback.this.onResult(Arrays.asList((Bitmap) obj));
                    }
                };
                List list = queryTile.f;
                if (list.isEmpty()) {
                    PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: nG2
                        @Override // java.lang.Runnable
                        public final void run() {
                            r1.onResult(null);
                        }
                    });
                    return;
                }
                boolean z = false;
                GURL gurl = (GURL) list.get(0);
                if (intValue > 0 && intValue > 0) {
                    z = true;
                }
                c9656sG2.f.d(new C0037Ah1(intValue, intValue, 1440, gurl.i(), "QueryTiles", z), r1);
            }
        });
        this.c = sl3;
        viewGroup.addView(sl3.b.b, new ViewGroup.LayoutParams(-1, -2));
        this.f = AbstractC0687Fh1.c(profile.g(), AbstractC6474j01.a);
        b();
    }

    public final void b() {
        if (!this.i) {
            C5566gM3 c5566gM3 = this.c.b.b;
            if (c5566gM3.computeHorizontalScrollOffset() != 0) {
                c5566gM3.s.t0(0);
                return;
            }
            return;
        }
        C8971qG2 c8971qG2 = new C8971qG2(this);
        TileProviderBridge tileProviderBridge = this.d;
        long j = tileProviderBridge.a;
        if (j != 0) {
            N.Mq1q5_mC(j, tileProviderBridge, null, c8971qG2);
        }
        this.i = false;
    }

    public static void a(C9656sG2 c9656sG2, List list) {
        C4191cM3 c4191cM3;
        BM3 bm3 = c9656sG2.e;
        bm3.getClass();
        if (list != null && !list.isEmpty() && bm3.a == null) {
            bm3.a = list;
            EI2.e(list.size(), "Search.QueryTiles.NTP.TileCount");
        }
        ArrayList arrayList = new ArrayList(list);
        SL3 sl3 = c9656sG2.c;
        sl3.getClass();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            c4191cM3 = sl3.a;
            if (i >= c4191cM3.size()) {
                break;
            }
            arrayList2.add((QueryTile) c4191cM3.get(i));
            i++;
        }
        boolean z = (arrayList2.isEmpty() || arrayList.isEmpty() || arrayList2.equals(arrayList)) ? false : true;
        c4191cM3.A(arrayList);
        C6940kM3 c6940kM3 = sl3.b;
        C5566gM3 c5566gM3 = c6940kM3.b;
        if (c5566gM3.computeHorizontalScrollOffset() != 0) {
            c5566gM3.s.t0(0);
        }
        if (z) {
            LayoutAnimationController layoutAnimationController = c6940kM3.d;
            C5566gM3 c5566gM32 = c6940kM3.b;
            c5566gM32.setLayoutAnimation(layoutAnimationController);
            c5566gM32.scheduleLayoutAnimation();
        }
        c9656sG2.a.setVisibility(list.isEmpty() ? 8 : 0);
    }
}
