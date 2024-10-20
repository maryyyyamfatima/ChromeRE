package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.suggestions.tile.SuggestionsTileView;
import org.chromium.chrome.browser.suggestions.tile.TopSitesTileView;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yM3 */
/* loaded from: classes.dex */
public final class C11745yM3 {
    public final Context a;
    public final Resources.Theme b;
    public final C6964kR2 c;
    public C0167Bh1 d;
    public final int e;
    public final int f;
    public final float g;
    public int h;
    public final int i;
    public final int j;

    public C11745yM3(Context context, int i, int i2, C0167Bh1 c0167Bh1) {
        this.d = c0167Bh1;
        this.h = i2;
        this.a = context;
        Resources resources = context.getResources();
        this.b = context.getTheme();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807e9);
        this.e = dimensionPixelSize;
        this.g = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807e6);
        this.f = Math.min(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807e8));
        int i3 = 0;
        this.i = i != 1 ? i != 2 ? 0 : R.layout.0_resource_name_obfuscated_res_0x7f0e028a : R.layout.0_resource_name_obfuscated_res_0x7f0e0289;
        if (i == 1) {
            i3 = R.layout.0_resource_name_obfuscated_res_0x7f0e02ca;
        } else if (i == 2) {
            i3 = R.layout.0_resource_name_obfuscated_res_0x7f0e02cb;
        }
        this.j = i3;
        this.c = new C6964kR2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize / 2, context.getColor(R.color.0_resource_name_obfuscated_res_0x7f07010e), resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807eb));
    }

    public final SuggestionsTileView a(PL3 pl3, ViewGroup viewGroup, UL3 ul3) {
        SuggestionsTileView suggestionsTileView;
        Activity a;
        C7722me3 c7722me3 = pl3.a;
        int i = c7722me3.d;
        Context context = this.a;
        if (i == 6) {
            suggestionsTileView = (TopSitesTileView) LayoutInflater.from(viewGroup.getContext()).inflate(this.j, viewGroup, false);
            pl3.e = C11674y84.b(context.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f0901bc, this.b);
            pl3.c = 3;
            if (b.n.f() && ul3 != null) {
                final C11402xM3 c11402xM3 = new C11402xM3(this, pl3, ul3.a(pl3));
                N.Mz5zXINc(Profile.d(), this.e, new Callback() { // from class: qM3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        c11402xM3.onLargeIconAvailable((Bitmap) obj, -16777216, false, 1);
                    }
                });
            }
        } else {
            suggestionsTileView = (SuggestionsTileView) LayoutInflater.from(viewGroup.getContext()).inflate(this.i, viewGroup, false);
        }
        int i2 = this.h;
        suggestionsTileView.getClass();
        String str = c7722me3.a;
        GURL gurl = c7722me3.b;
        String a2 = ON3.a(str, gurl);
        boolean z = pl3.g != null;
        Drawable drawable = pl3.e;
        suggestionsTileView.a.setVisibility(z ? 0 : 8);
        suggestionsTileView.i.setImageDrawable(drawable);
        suggestionsTileView.g.setLines(i2);
        suggestionsTileView.g.setText(a2);
        suggestionsTileView.k = c7722me3;
        suggestionsTileView.a(pl3);
        if (b.n.f() && ul3 != null) {
            d(pl3, ul3);
            boolean b = b(pl3);
            String str2 = c7722me3.a;
            if (b) {
                suggestionsTileView.setContentDescription(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14014f, str2));
            } else {
                suggestionsTileView.setContentDescription(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14014e, str2, gurl.d()));
            }
            YL3 yl3 = new YL3(ul3.a, c7722me3);
            int i3 = c7722me3.d;
            if (i3 == 5) {
                yl3.g = new Runnable() { // from class: rM3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11745yM3.this.getClass();
                        LU3.a(Profile.d()).notifyEvent("homepage_tile_clicked");
                        EI2.h(0, 3, "NewTabPage.SuggestTiles.SelectedTileType");
                    }
                };
            } else if (i3 == 6) {
                yl3.g = new Runnable() { // from class: sM3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11745yM3.this.getClass();
                        LU3.a(Profile.d()).notifyEvent("explore_sites_tile_tapped");
                        EI2.h(0, 3, "NewTabPage.SuggestTiles.SelectedTileType");
                    }
                };
            } else if (b(pl3)) {
                yl3.g = new Runnable() { // from class: tM3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EI2.h(2, 3, "NewTabPage.SuggestTiles.SelectedTileType");
                    }
                };
                yl3.h = new Runnable() { // from class: uM3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EI2.h(2, 3, "NewTabPage.SuggestTiles.DeletedTileType");
                    }
                };
            } else {
                yl3.g = new Runnable() { // from class: vM3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EI2.h(1, 3, "NewTabPage.SuggestTiles.SelectedTileType");
                    }
                };
                yl3.h = new Runnable() { // from class: wM3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EI2.h(1, 3, "NewTabPage.SuggestTiles.DeletedTileType");
                    }
                };
            }
            suggestionsTileView.setOnClickListener(yl3);
            suggestionsTileView.setOnCreateContextMenuListener(yl3);
            if (i3 == 6) {
                Profile d = Profile.d();
                Context context2 = suggestionsTileView.getContext();
                if (context2 != null && (a = V60.a(context2)) != null) {
                    if (suggestionsTileView.isAttachedToWindow()) {
                        AbstractC10335uF0.a(suggestionsTileView, d, a);
                    } else {
                        suggestionsTileView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9649sF0(suggestionsTileView, d, a));
                    }
                }
            }
        }
        return suggestionsTileView;
    }

    public static boolean b(PL3 pl3) {
        TemplateUrlService a;
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("OrganicRepeatableQueries") || (a = IG3.a()) == null) {
            return false;
        }
        GURL gurl = pl3.a.b;
        Object obj = ThreadUtils.a;
        return N.MF3JCGn0(a.c, a, gurl);
    }

    public final void d(final PL3 pl3, UL3 ul3) {
        if (b(pl3)) {
            final TL3 a = ul3.a(pl3);
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: pM3
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = C11745yM3.this.a;
                    Resources resources = context.getResources();
                    ThreadLocal threadLocal = GP2.a;
                    Drawable drawable = resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f090325, null);
                    PL3 pl32 = pl3;
                    pl32.e = drawable;
                    pl32.f = Y50.b(context, R.color.0_resource_name_obfuscated_res_0x7f07012a);
                    pl32.c = 3;
                    Runnable runnable = a;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            return;
        }
        C0167Bh1 c0167Bh1 = this.d;
        if (c0167Bh1 != null) {
            C7722me3 c7722me3 = pl3.a;
            if (c7722me3.d != 6) {
                C11402xM3 c11402xM3 = new C11402xM3(this, pl3, ul3.a(pl3));
                if (c0167Bh1.b == null) {
                    Object obj = ThreadUtils.a;
                    if (C8819pp3.a == null) {
                        C8819pp3.a = new C8819pp3();
                    }
                    C8819pp3.a.getClass();
                    c0167Bh1.b = new LargeIconBridge(c0167Bh1.a);
                }
                c0167Bh1.b.b(c7722me3.b, this.f, c11402xM3);
            }
        }
    }

    public final void c(List list, ViewGroup viewGroup, UL3 ul3) {
        ImageView imageView;
        TraceEvent i = TraceEvent.i("TileRenderer.renderTileSection", null);
        try {
            HashMap hashMap = new HashMap();
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                SuggestionsTileView suggestionsTileView = (SuggestionsTileView) viewGroup.getChildAt(i2);
                hashMap.put(suggestionsTileView.k, suggestionsTileView);
            }
            viewGroup.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PL3 pl3 = (PL3) it.next();
                SuggestionsTileView suggestionsTileView2 = (SuggestionsTileView) hashMap.get(pl3.a);
                if (suggestionsTileView2 == null || (imageView = suggestionsTileView2.i) == null || imageView.getDrawable() == null || pl3.a.d == 6) {
                    suggestionsTileView2 = a(pl3, viewGroup, ul3);
                }
                viewGroup.addView(suggestionsTileView2);
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
