//
//  ViewController.m
//  iosApp
//

#import "ViewController.h"
#import <shared/shared.h>
@interface ViewController ()
@property (nonatomic, strong) SharedVCDelegate *delegate;
@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    self.delegate = [[SharedVCDelegate alloc] initWithController:self];
    UIView *subview = [self.delegate  onViewDidLoad];
    [self.view addSubview:subview];
}

- (void)viewWillAppear:(BOOL)animated {
    [super viewWillAppear:animated];
}

- (void)viewDidAppear:(BOOL)animated {
    [super viewDidAppear:animated];
    [self.delegate onViewDidAppear];
}

@end
