package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.Set;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nO1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7980nO1 {
    public final int a;
    public final MediaMetadata b;
    public final boolean c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final Bitmap h;
    public final int i;
    public final Bitmap j;
    public final int k;
    public final Intent l;
    public final InterfaceC8324oO1 m;
    public final Set n;
    public final MediaPosition o;

    public C7980nO1(MediaMetadata mediaMetadata, boolean z, String str, int i, boolean z2, int i2, Bitmap bitmap, int i3, Bitmap bitmap2, int i4, int i5, Intent intent, InterfaceC8324oO1 interfaceC8324oO1, Set set, MediaPosition mediaPosition) {
        this.b = mediaMetadata;
        this.c = z;
        this.d = str;
        this.e = i;
        this.f = z2;
        this.g = i2;
        this.h = bitmap;
        this.i = i3;
        this.j = bitmap2;
        this.a = i4;
        this.k = i5;
        this.l = intent;
        this.m = interfaceC8324oO1;
        this.n = set;
        this.o = mediaPosition;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        MediaMetadata mediaMetadata;
        MediaMetadata mediaMetadata2;
        Intent intent;
        Intent intent2;
        InterfaceC8324oO1 interfaceC8324oO1;
        InterfaceC8324oO1 interfaceC8324oO12;
        Set set;
        Set set2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7980nO1)) {
            return false;
        }
        C7980nO1 c7980nO1 = (C7980nO1) obj;
        return this.c == c7980nO1.c && this.f == c7980nO1.f && this.e == c7980nO1.e && this.g == c7980nO1.g && ((bitmap = this.h) == (bitmap2 = c7980nO1.h) || (bitmap != null && bitmap.sameAs(bitmap2))) && this.i == c7980nO1.i && this.j == c7980nO1.j && this.a == c7980nO1.a && this.k == c7980nO1.k && (((mediaMetadata = this.b) == (mediaMetadata2 = c7980nO1.b) || (mediaMetadata != null && mediaMetadata.equals(mediaMetadata2))) && TextUtils.equals(this.d, c7980nO1.d) && (((intent = this.l) == (intent2 = c7980nO1.l) || (intent != null && intent.equals(intent2))) && (((interfaceC8324oO1 = this.m) == (interfaceC8324oO12 = c7980nO1.m) || (interfaceC8324oO1 != null && interfaceC8324oO1.equals(interfaceC8324oO12))) && (((set = this.n) == (set2 = c7980nO1.n) || (set != null && set.equals(set2))) && this.o == c7980nO1.o))));
    }

    public final int hashCode() {
        int i = (((this.c ? 1 : 0) * 31) + (this.f ? 1 : 0)) * 31;
        MediaMetadata mediaMetadata = this.b;
        int hashCode = (i + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.l;
        int hashCode3 = (((((hashCode2 + (intent == null ? 0 : intent.hashCode())) * 31) + this.e) * 31) + this.g) * 31;
        Bitmap bitmap = this.h;
        int hashCode4 = (((hashCode3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.i) * 31;
        Bitmap bitmap2 = this.j;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((((((hashCode4 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + this.a) * 31) + this.k) * 31)) * 31)) * 31);
    }
}
