package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.explore_sites.ExperimentalExploreSitesCategoryTileView;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryTile;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5528gF0 {
    public final Profile a;
    public final InterfaceC8544p12 b;
    public final View c;
    public LinearLayout d;

    public C5528gF0(View view, Profile profile, C9162qp3 c9162qp3) {
        this.a = profile;
        this.c = view;
        this.b = c9162qp3;
        this.d = (LinearLayout) view.findViewById(R.id.experimental_explore_sites_tiles);
        N.MlOaOP27(profile, new ArrayList(), new Callback() { // from class: cF0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List<ExploreSitesCategoryTile> list = (List) obj;
                final C5528gF0 c5528gF0 = C5528gF0.this;
                if (list == null) {
                    c5528gF0.getClass();
                    return;
                }
                View view2 = c5528gF0.c;
                int min = Math.min(AbstractC1895Op0.b(view2.getContext()).c.x, view2.getResources().getDimensionPixelSize(R.dimen.f41880_resource_name_obfuscated_res_0x7f0807d9)) / 3;
                int i = 0;
                for (final ExploreSitesCategoryTile exploreSitesCategoryTile : list) {
                    i++;
                    if (i > 3) {
                        return;
                    }
                    final ExperimentalExploreSitesCategoryTileView experimentalExploreSitesCategoryTileView = (ExperimentalExploreSitesCategoryTileView) LayoutInflater.from(view2.getContext()).inflate(R.layout.f57480_resource_name_obfuscated_res_0x7f0e00fd, (ViewGroup) c5528gF0.d, false);
                    Context context = experimentalExploreSitesCategoryTileView.g;
                    Resources resources = context.getResources();
                    experimentalExploreSitesCategoryTileView.a = exploreSitesCategoryTile;
                    int dimensionPixelSize = min - (resources.getDimensionPixelSize(R.dimen.f31640_resource_name_obfuscated_res_0x7f0801fe) * 2);
                    experimentalExploreSitesCategoryTileView.k = dimensionPixelSize;
                    int i2 = (dimensionPixelSize * 2) / 3;
                    experimentalExploreSitesCategoryTileView.l = i2;
                    experimentalExploreSitesCategoryTileView.h = new C6964kR2(dimensionPixelSize, i2, resources.getDimensionPixelSize(R.dimen.f31650_resource_name_obfuscated_res_0x7f0801ff), context.getColor(R.color.f17660_resource_name_obfuscated_res_0x7f07010e), resources.getDimensionPixelSize(R.dimen.f42060_resource_name_obfuscated_res_0x7f0807eb));
                    experimentalExploreSitesCategoryTileView.a(null);
                    experimentalExploreSitesCategoryTileView.i.setText(experimentalExploreSitesCategoryTileView.a.c);
                    c5528gF0.d.addView(experimentalExploreSitesCategoryTileView);
                    experimentalExploreSitesCategoryTileView.setOnClickListener(new View.OnClickListener() { // from class: eF0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C5528gF0 c5528gF02 = C5528gF0.this;
                            c5528gF02.getClass();
                            c5528gF02.b.d(1, new LoadUrlParams(exploreSitesCategoryTile.a, 2));
                        }
                    });
                    N.Ms2rZgRf(c5528gF0.a, exploreSitesCategoryTile.b, new Callback() { // from class: fF0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            C5528gF0.this.getClass();
                            experimentalExploreSitesCategoryTileView.a((Bitmap) obj2);
                        }
                    });
                }
            }
        });
        view.findViewById(R.id.experimental_explore_sites_more_button).setOnClickListener(new View.OnClickListener() { // from class: dF0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5528gF0 c5528gF0 = C5528gF0.this;
                c5528gF0.getClass();
                c5528gF0.b.d(1, new LoadUrlParams(N.MFDJT1zY(), 2));
            }
        });
    }
}
