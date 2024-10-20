package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.chrome.R;
import java.util.Objects;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge;
import org.chromium.chrome.browser.suggestions.tile.MostVisitedTilesCarouselLayout;
import org.chromium.chrome.browser.suggestions.tile.MostVisitedTilesGridLayout;
import org.chromium.components.browser_ui.widget.tile.TileView;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eZ1 */
/* loaded from: classes.dex */
public final class C4941eZ1 implements T20 {
    public final Activity a;
    public final I5 g;
    public final C5285fZ1 h;
    public final WindowAndroid i;
    public final QZ3 j;
    public C11745yM3 k;
    public I60 l;
    public OfflinePageBridge m;

    public C4941eZ1(Activity activity, I5 i5, View view, WindowAndroid windowAndroid, boolean z, boolean z2, int i, int i2, E32 e32, F32 f32) {
        this.a = activity;
        this.g = i5;
        this.i = windowAndroid;
        ((ViewStub) view.findViewById(z2 ? R.id.mv_tiles_carousel_stub : R.id.mv_tiles_grid_stub)).inflate();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.mv_tiles_layout);
        if (!z2) {
            MostVisitedTilesGridLayout mostVisitedTilesGridLayout = (MostVisitedTilesGridLayout) viewGroup;
            mostVisitedTilesGridLayout.k = i2;
            mostVisitedTilesGridLayout.j = i;
        }
        QZ3 qz3 = new QZ3(viewGroup);
        this.j = qz3;
        PropertyModel propertyModel = new PropertyModel(AbstractC7347lZ1.f);
        UD2.a(propertyModel, new C7691mZ1(view, viewGroup), new TD2() { // from class: dZ1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                C7691mZ1 c7691mZ1 = (C7691mZ1) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = AbstractC7347lZ1.a;
                if (ld2 == fd2) {
                    c7691mZ1.a.setVisibility(propertyModel2.j(ld2) ? 0 : 8);
                    return;
                }
                LD2 ld22 = AbstractC7347lZ1.b;
                if (ld22 == fd2) {
                    c7691mZ1.b.setVisibility(propertyModel2.j(ld22) ? 0 : 8);
                    PD2 pd2 = AbstractC7347lZ1.c;
                    if (propertyModel2.i(pd2) == null) {
                        return;
                    }
                    ((View) propertyModel2.i(pd2)).setVisibility(propertyModel2.j(ld22) ? 8 : 0);
                    return;
                }
                PD2 pd22 = AbstractC7347lZ1.d;
                if (pd22 == fd2) {
                    MostVisitedTilesCarouselLayout mostVisitedTilesCarouselLayout = (MostVisitedTilesCarouselLayout) c7691mZ1.b;
                    int intValue = ((Integer) propertyModel2.i(pd22)).intValue();
                    int childCount = mostVisitedTilesCarouselLayout.getChildCount();
                    if (childCount == 0) {
                        return;
                    }
                    for (int i3 = 1; i3 < childCount; i3++) {
                        TileView tileView = (TileView) mostVisitedTilesCarouselLayout.getChildAt(i3);
                        int i4 = MostVisitedTilesCarouselLayout.a;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tileView.getLayoutParams();
                        if (intValue != marginLayoutParams.getMarginStart()) {
                            marginLayoutParams.setMarginStart(intValue);
                            tileView.setLayoutParams(marginLayoutParams);
                        }
                    }
                    return;
                }
                PD2 pd23 = AbstractC7347lZ1.e;
                if (pd23 == fd2) {
                    MostVisitedTilesCarouselLayout mostVisitedTilesCarouselLayout2 = (MostVisitedTilesCarouselLayout) c7691mZ1.b;
                    int intValue2 = ((Integer) propertyModel2.i(pd23)).intValue();
                    int childCount2 = mostVisitedTilesCarouselLayout2.getChildCount();
                    if (childCount2 == 0) {
                        return;
                    }
                    TileView tileView2 = (TileView) mostVisitedTilesCarouselLayout2.getChildAt(0);
                    int i6 = MostVisitedTilesCarouselLayout.a;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) tileView2.getLayoutParams();
                    if (intValue2 != marginLayoutParams2.getMarginStart()) {
                        marginLayoutParams2.setMarginStart(intValue2);
                        tileView2.setLayoutParams(marginLayoutParams2);
                    }
                    TileView tileView3 = (TileView) mostVisitedTilesCarouselLayout2.getChildAt(childCount2 - 1);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) tileView3.getLayoutParams();
                    if (intValue2 != marginLayoutParams3.getMarginEnd()) {
                        marginLayoutParams3.setMarginEnd(intValue2);
                        tileView3.setLayoutParams(marginLayoutParams3);
                    }
                }
            }
        });
        PZ3 pz3 = qz3.a;
        boolean z3 = false;
        this.k = new C11745yM3(activity, pz3.a == 0 || pz3.b == 0 ? 2 : 1, 1, null);
        Resources resources = activity.getResources();
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.tile_grid_placeholder_stub);
        C11745yM3 c11745yM3 = this.k;
        if (z && z2) {
            z3 = true;
        }
        this.h = new C5285fZ1(resources, qz3, viewGroup, viewStub, c11745yM3, propertyModel, z3, z2, DeviceFormFactor.a(activity), e32, f32);
    }

    public final void b(InterfaceC10876vp3 interfaceC10876vp3, C3848bM3 c3848bM3, InterfaceC4226cT3 interfaceC4226cT3) {
        this.g.b(this);
        Profile d = Profile.d();
        C7928nE c7928nE = UN.a;
        int i = N.M09VlOh_("NewTabPageTilesTitleWrapAround") ? 2 : 1;
        C11745yM3 c11745yM3 = this.k;
        Activity activity = this.a;
        if (c11745yM3 == null) {
            PZ3 pz3 = this.j.a;
            this.k = new C11745yM3(activity, pz3.a == 0 || pz3.b == 0 ? 2 : 1, i, ((AbstractC11219wp3) interfaceC10876vp3).d);
        } else {
            c11745yM3.d = ((AbstractC11219wp3) interfaceC10876vp3).d;
            c11745yM3.h = i;
        }
        C9162qp3 c9162qp3 = ((AbstractC11219wp3) interfaceC10876vp3).b;
        Objects.requireNonNull(activity);
        I60 i60 = new I60(c9162qp3, interfaceC4226cT3, new RunnableC10678vF0(activity), "Suggestions");
        this.l = i60;
        this.i.A.a(i60);
        Object obj = ThreadUtils.a;
        if (C8819pp3.a == null) {
            C8819pp3.a = new C8819pp3();
        }
        C8819pp3.a.getClass();
        OfflinePageBridge a = OfflinePageBridge.a(d);
        this.m = a;
        I60 i602 = this.l;
        C11745yM3 c11745yM32 = this.k;
        C5285fZ1 c5285fZ1 = this.h;
        c5285fZ1.r = c11745yM32;
        ZL3 zl3 = new ZL3(c11745yM32, interfaceC10876vp3, i602, c3848bM3, c5285fZ1, a);
        c5285fZ1.s = zl3;
        zl3.f.add(1);
        MostVisitedSitesBridge mostVisitedSitesBridge = ((C3848bM3) zl3.c).d;
        mostVisitedSitesBridge.b = zl3;
        N.MsZWK0fV(mostVisitedSitesBridge.a, mostVisitedSitesBridge, mostVisitedSitesBridge, 12);
        c5285fZ1.c();
        IG3.a().a(c5285fZ1);
        c5285fZ1.t = true;
    }

    public final void a() {
        this.g.c(this);
        if (this.m != null) {
            this.m = null;
        }
        if (this.k != null) {
            this.k = null;
        }
        WindowAndroid windowAndroid = this.i;
        if (windowAndroid != null) {
            windowAndroid.A.d(this.l);
            this.l = null;
        }
        C5285fZ1 c5285fZ1 = this.h;
        if (c5285fZ1 != null) {
            ViewGroup viewGroup = c5285fZ1.h;
            if (viewGroup != null && c5285fZ1.k) {
                MostVisitedTilesCarouselLayout mostVisitedTilesCarouselLayout = (MostVisitedTilesCarouselLayout) viewGroup;
                for (int i = 0; i < mostVisitedTilesCarouselLayout.getChildCount(); i++) {
                    View childAt = mostVisitedTilesCarouselLayout.getChildAt(i);
                    childAt.setOnClickListener(null);
                    childAt.setOnCreateContextMenuListener(null);
                }
                mostVisitedTilesCarouselLayout.removeAllViews();
            }
            ZL3 zl3 = c5285fZ1.s;
            if (zl3 != null) {
                zl3.g.onDestroy();
                c5285fZ1.s = null;
            }
            IG3.a().h(c5285fZ1);
        }
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        C5285fZ1 c5285fZ1 = this.h;
        c5285fZ1.b();
        c5285fZ1.e();
        this.j.c();
    }
}
