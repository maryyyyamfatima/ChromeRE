package org.chromium.components.commerce.core;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ShoppingService {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface MerchantInfoCallback {
        void a(MerchantInfo merchantInfo);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class ProductInfo {
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface ProductInfoCallback {
        void a();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class MerchantInfo {
        public final float a;
        public final int b;
        public final GURL c;
        public final boolean d;
        public final float e;
        public final boolean f;
        public final boolean g;

        public MerchantInfo(float f, int i, GURL gurl, boolean z, float f2, boolean z2, boolean z3) {
            this.a = f;
            this.b = i;
            this.c = gurl;
            this.d = z;
            this.e = f2;
            this.f = z2;
            this.g = z3;
        }
    }

    public ShoppingService(long j) {
        this.a = j;
    }

    public final void destroy() {
        this.a = 0L;
    }

    public static ShoppingService create(long j) {
        return new ShoppingService(j);
    }

    public static ProductInfo createProductInfo(String str, GURL gurl, long j, long j2, String str2, long j3, String str3) {
        return new ProductInfo();
    }

    public static void runProductInfoCallback(ProductInfoCallback productInfoCallback, GURL gurl, ProductInfo productInfo) {
        productInfoCallback.a();
    }

    public static MerchantInfo createMerchantInfo(float f, int i, GURL gurl, boolean z, float f2, boolean z2, boolean z3) {
        return new MerchantInfo(f, i, gurl, z, f2, z2, z3);
    }

    public static void runMerchantInfoCallback(MerchantInfoCallback merchantInfoCallback, GURL gurl, MerchantInfo merchantInfo) {
        merchantInfoCallback.a(merchantInfo);
    }
}
