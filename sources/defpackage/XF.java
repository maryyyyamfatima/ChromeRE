package defpackage;

import android.view.accessibility.CaptioningManager;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XF extends CaptioningManager.CaptioningChangeListener {
    public static XF c;
    public final YF a = new YF();
    public final CaptioningManager b = (CaptioningManager) V60.a.getSystemService("captioning");

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        YF yf = this.a;
        yf.getClass();
        yf.h = new DecimalFormat("#%", new DecimalFormatSymbols(Locale.US)).format(f);
        yf.c();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onLocaleChanged(Locale locale) {
        this.a.getClass();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        YF yf = this.a;
        yf.a = z;
        yf.c();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        this.a.d(a(captionStyle));
    }

    public final void b() {
        CaptioningManager captioningManager = this.b;
        boolean isEnabled = captioningManager.isEnabled();
        YF yf = this.a;
        yf.a = isEnabled;
        yf.c();
        yf.h = new DecimalFormat("#%", new DecimalFormatSymbols(Locale.US)).format(captioningManager.getFontScale());
        yf.c();
        captioningManager.getLocale();
        yf.d(a(captioningManager.getUserStyle()));
    }

    public static ZF a(CaptioningManager.CaptionStyle captionStyle) {
        if (captionStyle == null) {
            return new ZF(null, null, null, null, null);
        }
        Integer valueOf = captionStyle.hasBackgroundColor() ? Integer.valueOf(captionStyle.backgroundColor) : null;
        Integer valueOf2 = captionStyle.hasEdgeColor() ? Integer.valueOf(captionStyle.edgeColor) : null;
        Integer valueOf3 = captionStyle.hasEdgeType() ? Integer.valueOf(captionStyle.edgeType) : null;
        Integer valueOf4 = captionStyle.hasForegroundColor() ? Integer.valueOf(captionStyle.foregroundColor) : null;
        captionStyle.hasWindowColor();
        return new ZF(valueOf, valueOf2, valueOf3, valueOf4, captionStyle.getTypeface());
    }
}
