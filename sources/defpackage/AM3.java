package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class AM3 implements InterfaceC0079Ap3 {
    public final C12088zM3 a = new C12088zM3();
    public final Resources g;
    public final int h;
    public final int i;
    public final int j;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        return this.a;
    }

    public AM3(Context context) {
        Resources resources = context.getResources();
        this.g = resources;
        this.h = resources.getDimensionPixelOffset(R.dimen.f41980_resource_name_obfuscated_res_0x7f0807e3);
        this.i = resources.getDimensionPixelOffset(R.dimen.f41820_resource_name_obfuscated_res_0x7f0807d3);
        this.j = resources.getDimensionPixelOffset(R.dimen.f41820_resource_name_obfuscated_res_0x7f0807d3);
        a();
    }

    public final void a() {
        int i = this.g.getDisplayMetrics().widthPixels;
        int i2 = this.j;
        int i3 = this.i;
        double d = ((i - (i2 * 2)) + i3) / (this.h + i3);
        double floor = Math.floor(d) + Math.max(0.3d, Math.min(0.7d, d - Math.floor(d)));
        double floor2 = ((r0.getDisplayMetrics().widthPixels - (i2 * 2)) - (Math.floor(floor) * i3)) / floor;
        C12088zM3 c12088zM3 = this.a;
        c12088zM3.getClass();
        c12088zM3.a = (int) floor2;
        EI2.i((int) (floor2 / r0.getDisplayMetrics().density), 50, 150, 101, "Search.QueryTiles.TileWidth");
        EI2.i((int) floor, 0, 20, 21, "Search.QueryTiles.TilesFitPerRow");
    }
}
