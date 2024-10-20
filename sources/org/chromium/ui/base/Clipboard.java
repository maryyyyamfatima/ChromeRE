package org.chromium.ui.base;

import android.content.ClipboardManager;
import android.net.Uri;
import defpackage.AbstractC4851eH1;
import defpackage.QU;
import defpackage.V60;
import defpackage.XU;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class Clipboard {
    public static Clipboard b;
    public long a;

    public boolean a() {
        return false;
    }

    public void b(GURL gurl) {
    }

    public Uri c() {
        return null;
    }

    public void clear() {
    }

    public void d(boolean z) {
    }

    public String getCoercedText() {
        return null;
    }

    public String getHTMLText() {
        return null;
    }

    public String getImageUriString() {
        return null;
    }

    public byte[] getPng() {
        return null;
    }

    public String getUrl() {
        return null;
    }

    public boolean hasCoercedText() {
        return false;
    }

    public boolean hasHTMLOrStyledText() {
        return false;
    }

    public boolean hasImage() {
        return false;
    }

    public boolean hasUrl() {
        return false;
    }

    public static Clipboard getInstance() {
        if (b == null) {
            ClipboardManager clipboardManager = (ClipboardManager) V60.a.getSystemService("clipboard");
            if (clipboardManager != null) {
                b = new XU(clipboardManager);
            } else {
                b = new Clipboard();
            }
        }
        return b;
    }

    public void setText(String str) {
        AbstractC4851eH1.f("Clipboard", "setText is a no-op because Clipboard service isn't available", new Object[0]);
    }

    public void h(String str, String str2) {
        AbstractC4851eH1.f("Clipboard", "setText is a no-op because Clipboard service isn't available", new Object[0]);
    }

    public void setHTMLText(String str, String str2) {
        AbstractC4851eH1.f("Clipboard", "setHTMLText is a no-op because Clipboard service isn't available", new Object[0]);
    }

    public void g(String str) {
        AbstractC4851eH1.f("Clipboard", "setPassword is a no-op because Clipboard service isn't available", new Object[0]);
    }

    public void f(Uri uri) {
        AbstractC4851eH1.f("Clipboard", "setImageUri is a no-op because Clipboard service isn't available", new Object[0]);
    }

    public void setImage(byte[] bArr, String str) {
        AbstractC4851eH1.f("Clipboard", "setImage is a no-op because Clipboard service isn't available", new Object[0]);
    }

    public final void setNativePtr(long j) {
        this.a = j;
    }

    public void e(QU qu) {
        AbstractC4851eH1.f("Clipboard", "setImageFileProvider is a no-op because Clipboard service isn't available", new Object[0]);
    }
}
