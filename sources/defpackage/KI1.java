package defpackage;

import android.graphics.Point;
import android.util.Size;
import org.chromium.base.Callback;
import org.chromium.base.UnguessableToken;
import org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabService;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KI1 {
    public PlayerCompositorDelegateImpl a;
    public final Callback b;
    public Size c;
    public Point d;

    static {
        new JI1();
    }

    public KI1(GURL gurl, LongScreenshotsTabService longScreenshotsTabService, long j, C8524oy c8524oy) {
        this.b = c8524oy;
        this.a = new PlayerCompositorDelegateImpl(longScreenshotsTabService, j, gurl, "long_screenshots_dir", true, new InterfaceC3357Zv2() { // from class: HI1
            @Override // defpackage.InterfaceC3357Zv2
            public final void a(UnguessableToken unguessableToken, UnguessableToken[] unguessableTokenArr, int[] iArr, int[] iArr2, int[] iArr3, UnguessableToken[] unguessableTokenArr2, int[] iArr4, float f, long j2) {
                Size size;
                Size size2;
                KI1 ki1 = KI1.this;
                ki1.getClass();
                if (iArr != null && iArr.length >= 2) {
                    size = new Size(iArr[0], iArr[1]);
                } else {
                    size = new Size(0, 0);
                }
                ki1.c = size;
                if (iArr2 != null && iArr2.length >= 2) {
                    size2 = new Size(iArr2[0], iArr2[1]);
                } else {
                    size2 = new Size(0, 0);
                }
                ki1.d = new Point(size2.getWidth(), size2.getHeight());
                ki1.b.onResult(0);
            }
        }, new Callback() { // from class: II1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                KI1.this.b.onResult(Integer.valueOf(((Integer) obj).intValue()));
            }
        });
    }
}
