
#import <Foundation/Foundation.h>
#import <CommonCrypto/CommonCryptor.h>
#import <CommonCrypto/CommonKeyDerivation.h>
@interface NSData (AES256)
+ (NSString *)AES256EncryptWithPlainText:(NSString *)plain;        /*加密方法,参数需要加密的内容*/
+ (NSString *)AES256DecryptWithCiphertext:(NSString *)ciphertexts; /*解密方法，参数数密文*/
@end
